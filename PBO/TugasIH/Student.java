import java.util.Scanner;

class Person {
    protected String name;
    protected String address;
    protected String hobby; 
    
    public void identity() {
        System.out.println("Nama : " + name);
        System.out.println("Alamat : " + address);
        System.out.println("Hobi : " + hobby); 
    }
    
    public void setHobby(String newHobby) {
        hobby = newHobby;
    }
}

public class Student extends Person {
    String nim;
    double spp;
    double sks;
    double modul;
    
    public String getNim() {
        return nim;
    }

    @Override
    public void identity() {
        System.out.println("NIM : " + getNim());
        super.identity();
    }
    
    public double hitungPembayaran() {
        double totalTagihan = spp + sks + modul;
        return totalTagihan;
    }
}

class InheritMain {
    
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       Student mahasiswa = new Student();

       System.out.print("Masukkan Nama: ");
       mahasiswa.name = scanner.nextLine();

       System.out.print("Masukkan Alamat: ");
       mahasiswa.address = scanner.nextLine();

       System.out.print("Masukkan NIM: ");
       mahasiswa.nim = scanner.nextLine();

       System.out.print("Masukkan Tagihan SPP : ");
       mahasiswa.spp = scanner.nextDouble();

       System.out.print("Masukkan Tagihan SKS : ");
       mahasiswa.sks = scanner.nextDouble();

       System.out.print("Masukkan Tagihan Modul : ");
       mahasiswa.modul = scanner.nextDouble();
       
       System.out.print("Masukkan Hobi: ");
       mahasiswa.setHobby(scanner.next()); 

       mahasiswa.identity();
       System.out.println("Total Tagihan Pembayaran: Rp" + mahasiswa.hitungPembayaran());
   }
}
