/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perpustakaan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Perpustakaan {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://127.0.0.1/LatihanJavaDB"; 
    static final String USER = "root";
    static final String PASS = "";
    
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input");
            System.out.println("2. Delete");
            System.out.println("3. View");
            System.out.println("4. Edit");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    insert(scanner);
                    break;
                case 2:
                    delete(scanner);
                    break;
                case 3:
                    show();
                    break;
                case 4:
                    edit(scanner);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }

    public static void insert(Scanner scanner) {
        System.out.print("Enter book title: ");
        String judul_buku = scanner.nextLine();
        System.out.print("Enter publication year: ");
        int tahun_terbit = scanner.nextInt();
        System.out.print("Enter stock: ");
        int stok = scanner.nextInt();
        System.out.print("Enter author ID: ");
        int penulis_id = scanner.nextInt();

        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            
            String sql = "INSERT INTO buku (judul_buku, tahun_terbit, stok, penulis) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, judul_buku);
            ps.setInt(2, tahun_terbit);
            ps.setInt(3, stok);
            ps.setInt(4, penulis_id);
            
            ps.executeUpdate();
            
            ps.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void delete(Scanner scanner) {
        System.out.print("Enter book ID to delete: ");
        int id = scanner.nextInt();

        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            
            String sql = "DELETE FROM buku WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            
            ps.executeUpdate();
            
            ps.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void show() {
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            
            rs = stmt.executeQuery("SELECT * FROM buku");
            int i = 1;
            while (rs.next()) {
                System.out.println("Data ke-" + i);
                System.out.println("ID Buku: " + rs.getInt("id"));
                System.out.println("Judul Buku: " + rs.getString("judul_buku"));
                System.out.println("Tahun Terbit: " + rs.getInt("tahun_terbit"));
                System.out.println("Stok: " + rs.getInt("stok"));
                System.out.println("Penulis ID: " + rs.getInt("penulis"));
                i++;
            }
            
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void edit(Scanner scanner) {
        System.out.print("Enter book ID to edit: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Enter new book title: ");
        String judul_buku = scanner.nextLine();
        System.out.print("Enter new publication year: ");
        int tahun_terbit = scanner.nextInt();
        System.out.print("Enter new stock: ");
        int stok = scanner.nextInt();
        System.out.print("Enter new author ID: ");
        int penulis_id = scanner.nextInt();

        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            
            String sql = "UPDATE buku SET judul_buku = ?, tahun_terbit = ?, stok = ?, penulis = ? WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, judul_buku);
            ps.setInt(2, tahun_terbit);
            ps.setInt(3, stok);
            ps.setInt(4, penulis_id);
            ps.setInt(5, id);
            
            ps.executeUpdate();
            
            ps.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
