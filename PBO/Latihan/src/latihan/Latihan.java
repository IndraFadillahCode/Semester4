/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan;
import java.sql.*;

/**
 *
 * @author D2K
 */
public class Latihan {

    /**
     * @param args the command line arguments
     */
    static final String JDBC_DRIVER = "com.msql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://192.168.10.253/perpustakaan";
    static final String USER = "root";
    static final String PASS = "";
    
    static Connection conn;
    static Statement stat;
    static ResultSet rs;
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        insert();
        show();
    }
    
}
