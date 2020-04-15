package com.helorudi.javafundamental.function;

public class InputFunction {
    public static void main(String[] args) {
        // memanggil fungsi
        hitungLuas(9, 8.5);
    }

    private static void hitungLuas(double panjang, double lebar) {
        double luas;
        luas = panjang * lebar;
        System.out.println(luas);
    }
}
