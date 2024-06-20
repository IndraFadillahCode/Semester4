package W9;

public class BangunDatar
{

    private int panjang;
    private int lebar;
    private int tinggi;
    private int diameter;
    private int sisi;
    private int alas;
    private static final float pi = 3.14f;

    public BangunDatar(int sisi){
        this.sisi=sisi;
    }

    public BangunDatar(int panjang, int lebar){
        this.panjang=panjang;
        this.lebar=lebar;
    }

    public int luas(int a){
        return a*a;
    }

    public float luas(float a, float b){
        return (a*b)/2;
    }

    public double luas (double a){
        return (double) pi*a*a;
    }

    public int kelilingpersegi(int sisi){
        return 4*sisi;
    }
}