package com.helorudi.javafundamental.function;

public class ReturnFunction {
    public static void main(String[] args) {
        double p = 9;
        double l = 8.5;
        double hasil = hitungLuas(p,l); // memanggil fungsi
        System.out.println("Hasilnya adalah = " + hasil);
    }

    private static double hitungLuas(double panjang, double lebar) {
        double luas = panjang * lebar;
        return luas;
    }
}
