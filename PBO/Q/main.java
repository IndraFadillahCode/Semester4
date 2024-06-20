package Q;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        pegawai[] pegawaiArray = new pegawai[7];
    

    //input data staff
    for (int i = 0; i < 3; i++){
        System.out.println("Masukkan data staf : "+(i+1));
            
    System.out.print("Nama : ");
        String nama = scanner.nextLine();

    System.out.print("Departemen : ");
        String departemen = scanner.nextLine();

    System.out.print("Usia : ");
        int usia = scanner.nextInt();

    System.out.print("Gaji : ");
        double gaji = scanner.nextDouble();

    System.out.print("Masa Kerja : ");
        int masaKerja = scanner.nextInt();
            scanner.nextLine();

    pegawaiArray[i] = new pegawai(nama, departemen, usia, gaji, masaKerja);
    }

    //input data ob
    for (int i = 3; i < 6; i++) {
        System.out.println("Masukkan data ob : " + (i - 2));

    System.out.print("Nama : ");
        String nama = scanner.nextLine();

    System.out.print("Departemen : ");
        String departemen = scanner.nextLine();

    System.out.print("Usia : ");
        int usia = scanner.nextInt();

    System.out.print("Gaji : ");
        double gaji = scanner.nextDouble();

    System.out.print("Masa Kerja : ");
        int masaKerja = scanner.nextInt();
            scanner.nextLine();    
            pegawaiArray[i] = new pegawai(nama, departemen, usia, gaji, masaKerja);
    }

    //input data direktur
    System.out.println("Masukkan data direktur : ");{
        System.out.print("Nama : ");
        String nama = scanner.nextLine();

    System.out.print("Departemen : ");
        String departemen = scanner.nextLine();

    System.out.print("Usia : ");
        int usia = scanner.nextInt();

    System.out.print("Gaji : ");
        double gaji = scanner.nextDouble();

    System.out.print("Masa Kerja : ");
        int masaKerja = scanner.nextInt();
            scanner.nextLine();    

           
    }

    //Menampilkan Hasil
    for (pegawai pegawai : pegawaiArray){
        System.out.println("\nData Pegawai : ");
        System.out.println("Nama : " + pegawai.getNama());
        System.out.println("Departemen : " + pegawai.getDepartemen());
        System.out.println("Usia : " + pegawai.getUsia());
        System.out.println("Gaji : " + pegawai.getGaji());
        System.out.println("Masa Kerja : " + pegawai.getMasaKerja() + "Tahun");

        double thr = pegawai.hitungTHR();
        double TotalPendapatan = pegawai.getGaji() + thr;
            System.out.println("THR : " + thr);
            System.out.println("total pendapatan (gaji + thr) : " + TotalPendapatan);
        }
    }
}