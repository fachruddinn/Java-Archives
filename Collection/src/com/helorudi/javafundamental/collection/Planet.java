package com.helorudi.javafundamental.collection;

class Planet {

    private String nama;
    private double berat;

    public Planet(String nama, double berat) {
        this.nama = nama;
        this.berat = berat;
    }

    @Override
    public String toString() {
        return "Planet " + nama + ", berat: " + berat;
    }
}
