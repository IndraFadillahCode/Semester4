package W7;
import W1.Mahasiswa;
import java.time.Period;
import java.util.Locale;

public class MahasiswaAktif extends Mahasiswa
{
    public int usia;
    public int semester;

    public MahasiswaAktif(String nim, String nama, String tanggal_lahir, int semester)
    {
        super (nama, nim, tanggal_lahir);
        this.semester = semester;
    }

    //overriding
    public void getIdentitas()
    {
        System.out.println("Nama Mahasiswa : "+super.getNama());
        System.out.println("Nim Mahasiswa : "+super.getNim());
        System.out.println("Tanggal Lahir : "+super.getTanggalLahir());
        System.out.println("Semester : "+getSemester());
        System.out.println("Usia : "+getUsia());

    }

    public int getUsia()
    {
        return usia;
    }

    public int getSemester()
    {
        return semester;
    }
}