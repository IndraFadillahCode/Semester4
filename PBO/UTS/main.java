package UTS;
import java.util.Scanner;
import java.util.*;
import UTS.MahasiswaBaru;

public class main{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        MahasiswaBaru[] MahasiswaBaruArray = new MahasiswaBaru[4];
    

    
    for (int i = 0; i < 3; i++){
        System.out.println("Masukkan data : "+(i+1));
            
    System.out.print("Nama : ");
        String nama = scanner.nextLine();

    System.out.print("Nim : ");
        String nim = scanner.nextLine();

    System.out.print("tanggal lahir : ");
        String tanggal_lahir = scanner.nextLine();

    System.out.print("Asal sekolah : ");
        String asal_sekolah = scanner.nextLine();

    System.out.print("nomor pendaftaran : ");
        String nomor_pendaftaran = scanner.nextLine();
            scanner.nextLine();

    MahasiswaBaruArray[i] = new MahasiswaBaru(nama, nim, tanggal_lahir, asal_sekolah, nomor_pendaftaran);
    }

    for (MahasiswaBaru MahasiswaBaru : MahasiswaBaruArray){
         System.out.println("\nData Siswa : ");
        System.out.println("Nama : " + MahasiswaBaru.getNama());
        System.out.println("Nim : " + MahasiswaBaru.getNim());
        System.out.println("tanggal lahir : " + MahasiswaBaru.getTanggalLahir());
        System.out.println("Asal sekolah : " + MahasiswaBaru.getAsalSekolah());
        System.out.println("nomor pendaftaran: " + MahasiswaBaru.getNomorPendaftaran());
    }
}
}