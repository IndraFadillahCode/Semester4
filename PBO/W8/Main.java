package W8;

public class Main{

    public static void main(String[] args){
        PesawatJet pesawatJet = new PesawatJet ("A320", 200, "A-1", 10000, 2000000);
        System.out.println("\nJenis : "+ pesawatJet.getJenis());
        System.out.println("Kapasitas : "+ pesawatJet.getKapasitas());
        System.out.println("Bahan bakar : "+ pesawatJet.getBahanBakar());
        System.out.println("jarak tempuh : "+ pesawatJet.getJarakTempuh());
        pesawatJet.start();
        pesawatJet.accelerate();
        pesawatJet.deaccelerate();
        pesawatJet.stop();
    }
}