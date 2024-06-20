package W8;

public class Senjata extends Helicopter{
    private String amunisi;
    private int jumlahAmunisi;

    public Senjata(String jenis, int kapasitas, String bahanBakar, int jumlahRotor, int ketinggianMaks, String amunisi, int jumlahAmunisi){
        super(jenis, kapasitas, bahanBakar, jumlahRotor, ketinggianMaks);
        this.amunisi = amunisi;
        this.jumlahAmunisi = jumlahAmunisi;
    }

    public String getAmunisi(){
        return amunisi;
    }

    public int getJumlahAmunisi(){
        return jumlahAmunisi;
    }

    public void setAmunisi(String amunisi){
        this.amunisi = amunisi;
    }
    public void setJumlahAmunisi(int jumlahAmunisi){
        this.jumlahAmunisi = jumlahAmunisi;
    }

}