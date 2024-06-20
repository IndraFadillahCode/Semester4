package W8;

    public class kendaraan {
        private String jenis;
        private int kapasitas;
        private String bahanBakar;

    public kendaraan(String jenis, int kapasitas, String bahanBakar) {
        this.jenis = jenis;
        this.kapasitas = kapasitas;
        this.bahanBakar = bahanBakar;
    }

    public String getJenis(){
        return jenis;
    }

    public int getKapasitas(){
        return kapasitas;
    }

    public String getBahanBakar(){
        return bahanBakar;
    }

    public void setJenis(String jenis){
        this.jenis = jenis;
    }

    public void setKapasitas(int kapasitas){
        this.kapasitas = kapasitas;
    }

    public void setBahanBakar(String bahanBakar){
        this.bahanBakar = bahanBakar;
    }

    public void start(){
        System.out.println (jenis + "mulai beroperasi");
    }

    public void stop(){
        System.out.println(jenis + "berhenti beroperasi");
    }
    }