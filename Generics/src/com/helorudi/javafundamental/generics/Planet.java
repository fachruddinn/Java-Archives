package com.helorudi.javafundamental.generics;

public class Planet {
    private String nama;
    private double masa;

    public Planet(String nama, double masa) {
        this.nama = nama;
        this.masa = masa;
    }

    public void print() {
        System.out.println("Planet " + nama + ", masa: " + masa);
    }

}
