package W8;

public class PesawatJet extends kendaraan{
    private int kecepatanMaks;
    private int jarakTempuh;

public PesawatJet(String jenis, int kapasitas, String bahanBakar, int kecepatanMaks, int jarakTempuh){
    super(jenis, kapasitas, bahanBakar);
    this.kecepatanMaks = kecepatanMaks;
    this.jarakTempuh = jarakTempuh;
}

public int getKecepatanMaks(){
    return kecepatanMaks;
}

public int getJarakTempuh(){
    return jarakTempuh;
}

public void setKecepatanMaks(int kecepatanMaks){
    this.kecepatanMaks = kecepatanMaks;
}

public void setJarakTempuh(int jarakTempuh){
    this.jarakTempuh = jarakTempuh;
}

public void accelerate() {
    System.out.println("pesawat jet "+getJenis()+"mempercepat");
}
public void deaccelerate(){
    System.out.println("pesawat jet"+getJenis()+"memperlambat");
}
}