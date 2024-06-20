package W5;
import W1.Mahasiswa;
import java.util.*;

public class MahasiswaArraylist
{
    public static void main(String[] args)
    {
        Mahasiswa mhs = new Mahasiswa("14186", "Indra");
        mhs.insertNilai(90.0);
        mhs.insertNilai(70.0);
        mhs.insertNilai(60.0);
        mhs.insertNilai(95.0);
        mhs.insertMatkul("PBO", "1412", 4);
        mhs.insertMatkul("SBD", "1406", 3);
        mhs.insertMatkul("ALPRO", "1409", 4);
        mhs.getMataKuliah();
        mhs.getIdentitas();
    }
}