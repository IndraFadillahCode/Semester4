package W1;
import W5.Matakuliah;
import java.util.ArrayList;
import java.util.Iterator;

public class Mahasiswa
{
    private String nama;
    private String nim;
    private String tanggal_lahir;
    private ArrayList<Double> nilai = new ArrayList<Double>();
    private ArrayList<Matakuliah> mk = new ArrayList<Matakuliah>();

    public Mahasiswa(String nim, String nama, String tanggal_lahir)  {
        this.nim = nim;
        this.nama = nama;
        this.tanggal_lahir = tanggal_lahir;
    }
         public Mahasiswa(String nim, String nama)  {
        this.nim = nim;
        this.nama = nama;
   
         }
    public void insertNilai (Double nl){
        nilai.add(nl);
    }

    public void insertMatkul(String matkul, String kelompok, int sks)
    {
        mk.add(new Matakuliah(matkul, kelompok, sks));
    }


    public void belajar ()
    {
            System.out.println(this.nama + " belajar ");
    }

    public void mainGame()
    {
            System.out.println(this.nama + " main game");
    }
        public void getIdentitas()
        
                
        {
                System.out.println("Nama Mahasiswa : "+nama);
                System.out.println("NIM Mahasiswa : "+nim);
                getNilai();
         }

         public String getNama() 
         {
                return nama;
         }

         public String getNim()
         {
                return nim;
         }

         public String getTanggalLahir()
         {
                return tanggal_lahir;
         }

         public void getNilai()
         {

                Iterator<Double> it = nilai.iterator();
                while(it.hasNext())
                {
                        System.out.println(it.next());
                }
         }

        public void getMataKuliah()
        {
                for(Matakuliah matkul : mk)
                {
                        System.out.println(matkul.getNamaMatkul()+" - "+matkul.getKelompok()+" - "+matkul.getSks());
                }
        }
        
}