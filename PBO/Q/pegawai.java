package Q;
public class pegawai {
     String nama;
     String departemen;
     int usia;
     double gaji;
     int masaKerja;

    //constructor
    public pegawai(String nama, String departemen, int usia, double gaji, int masaKerja){
        this.nama = nama;
        this.departemen = departemen;
        this.usia = usia;
        this.gaji = gaji;
        this.masaKerja = masaKerja;
    }

    //getter
    public String getNama() {
        return nama;
    }

    public String getDepartemen(){
        return departemen;
    }

    public int getUsia(){
        return usia;
    }
    
    public double getGaji(){
        return gaji;
    }

    public int getMasaKerja(){
        return masaKerja;
    }

    //Setter
    //public void setNama(String nama){
        //this.nama = nama;
    //}

    //public void setDepartemen(String departemen){
        //this.departemen = departemen;
    //}

   // public void setUsia(int usia){
    //    this.usia = usia;
   // }

  //  public void setGaji(double gaji){
   //     this.gaji = gaji;
   // }

 //   public void setMasaKerja(int masaKerja){
    //    this.masaKerja = masaKerja;
  //  }

    //Fungsi THR
    public double hitungTHR(){
        double thr;
        double limaGaji = 5 * gaji;

        if (masaKerja < 1){
            thr = 0.1 * limaGaji;
        } else if (masaKerja >=1 && masaKerja <= 5) {
            thr = 0.2 * limaGaji;
        } else {
            thr = 0.35 * limaGaji;
        }

        //Gaji di atas 5JT

        if (gaji > 5000000) {
            double pajak = 0.01 * thr;
            thr = pajak;
        }
        
        return thr;
    }
}