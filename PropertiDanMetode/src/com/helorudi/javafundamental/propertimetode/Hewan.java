package com.helorudi.javafundamental.propertimetode;

public class Hewan {

    // Properti atau fields
//    double tinggi;
//    double berat;
//    int umur;

    // Properti atau fields
    // Inisiasi dengan nilai inisial
    double tinggi = 22;
    double berat = 2;

    // Inisiasi melalui konstruktor
    int umur;

    // Konstruktor dengan parameter
//    Hewan(int umurParam) {
//        umur = umurParam;
//    }

    // Konstruktor dengan parameter
    Hewan(int umur) {
        this.umur = umur;
    }

    void lari(){
        System.out.println("Berlari dengan sangat cepat..");
    }

    void jalan(){
        System.out.println("Berjalan dengan pelan..");
    }

    void makan(){
        System.out.println("Makan dengan menggunakan mulut..");
    }

    double getBerat() {
        return berat;
    }

    double getTinggi() {
        return tinggi;
    }

    int getUmur() {
        return umur;
    }
}
