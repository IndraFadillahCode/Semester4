package W8;

public class Helicopter extends kendaraan{
    private int jumlahRotor;
    private int ketinggianMaks;

    public Helicopter(String jenis, int kapasitas, String bahanBakar, int jumlahRotor, int ketinggianMaks){
        super(jenis, kapasitas, bahanBakar);
        this.jumlahRotor = jumlahRotor;
        this.ketinggianMaks = ketinggianMaks;
    }

    public int getJumlahRotor(){
        return jumlahRotor;
    }

    public int ketinggianMaks(){
        return ketinggianMaks;
    }

    public void setJumlahRotor(int jumlahRotor){
        this.jumlahRotor = jumlahRotor;
    }

    public void setKetinggianMaks(int ketinggianMaks){
        this.ketinggianMaks = ketinggianMaks;
    }

    public void takeoff(){
        System.out.println("Helicopter "+ getJenis()+ "lepas landas");
    }

    public void land(){
        System.out.println("Helicopter "+getJenis()+"mendarat");
    }
}