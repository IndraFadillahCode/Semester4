package W4;
import W1.Mahasiswa;
import java.util.*;

public class Akademik {
    public static void main(String[] args) {
        int n;
        System.out.print("Masukkan Jumlah Data : ");

        //buat objek dari class scanner untuk menginput data

        Scanner inp = new Scanner(System.in);
        n = inp.nextInt();

        
        String[] nim = new String[n];
        String[] nama = new String[n];
        Double[] ipk = new Double[n];

        for(int i = 0; i < n; i++)
        {
            System.out.println("Data ke-"+(i+1));
            System.out.print("Masukkan NIM: ");
            nim[i] = inp.next();
            System.out.print("Masukkan Nama : ");
            nama[i] = inp.next();
            System.out.print("Masukkan IPK : ");
            ipk[i] = inp.nextDouble();
        }

        Mahasiswa mhs = new Mahasiswa(nim,nama,ipk);
        mhs.getIdentitas();
    }
}