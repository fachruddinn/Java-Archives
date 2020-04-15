package com.helorudi.javafundamental.collection;

import java.util.ArrayList;
import java.util.List;

public class ListPlanet {

    public static void main(String[] args) {
        // deklarasi Array
        String[] heroes = new String[2];
        heroes[0] = "rizki";
        heroes[1] = "ahmad";
        // heroes[2] = "ibrahim";
        // error ArrayIndexOutOfBoundsException karena ukuran Array tetap

        // menggunakan ArrayList
        List<String> planets = new ArrayList<>();
        // method add() untuk menambahkan objek ke List
        planets.add("merkurius");
        planets.add("venus");
        planets.add("bumi");
        planets.add("mars");
        // objek lainnya masih bisa terus ditambahkan ke List

        System.out.println("List planets awal:");
        // method size() untuk mendapatkan ukuran List
        for (int i = 0; i < planets.size(); i++) {
            // method get() untuk melihat isi List pada index i
            System.out.println("\t index-" + i + " = " + planets.get(i));
        }

        // method remove() untuk mengeluarkan objek dari List
        planets.remove("venus");

        System.out.println("List planets akhir:");
        for (int i = 0; i < planets.size(); i++) {
            System.out.println("\t index-" + i + " = " + planets.get(i));
        }
    }
}
