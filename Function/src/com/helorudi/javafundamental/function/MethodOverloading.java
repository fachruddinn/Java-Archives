package com.helorudi.javafundamental.function;

public class MethodOverloading {
    public static void main (String[] args) {
        double p = 9;
        double l = 8.5;
        double hasil = hitungLuas(p, l);
        System.out.println("Hasilnya adalah = " + hasil);

        int pn = 9;
        int lb = 8;
        int hsl = hitungLuas(pn, lb);
        System.out.println("Hasilnya adalah = " + hsl);
    }

    public static double hitungLuas(double panjang, double lebar) {
        double luas = panjang * lebar;
        return luas;
    }

    public static int hitungLuas(int panjang, int lebar) {
        int luas = panjang * lebar;
        return luas;
    }
}
