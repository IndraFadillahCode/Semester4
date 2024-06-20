package W9;

public class Main {

    public static void main (String[] args){
        BangunDatar kotak = new BangunDatar(4);
        System.out.println("Luas kotak : "+kotak.luas(4));

        BangunDatar lingkaran = new BangunDatar(5);
        System.out.println("Luas lingkaran : "+lingkaran.luas(5.0f));

    }
}