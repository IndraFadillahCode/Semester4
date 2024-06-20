package UTS;


public class MahasiswaBaru  {

    private String nama;
    private String nim;
    private String tanggal_lahir;
    private String asal_sekolah;
    private String nomor_pendaftaran;

    public MahasiswaBaru(String nama, String nim,String tanggal_lahir, String asal_sekolah, String nomor_pendaftaran){
    
    this.nama = nama;
    this.nim = nim;
    this.tanggal_lahir = tanggal_lahir;
    this.asal_sekolah = asal_sekolah;
    }

    public String getNim()
    {
        return nim;
    }

    public String getNama()
    {
        return nama;
    }
    
    public String getTanggalLahir()
    {
        return tanggal_lahir;
    }

    public String getAsalSekolah()
    {
        return asal_sekolah;
    }

    public String getNomorPendaftaran()
    {
        return nomor_pendaftaran;
    }

    public void getIdentitas()
    {
        System.out.println("Nama : "+ getNama());
        System.out.println("Nim : "+getNim());
        System.out.println("tanggal lahir : "+getTanggalLahir());
        System.out.println("Asal Sekolah : "+getAsalSekolah());
        System.out.println("Nomor Pendaftaran : " +getNomorPendaftaran());
    }
}