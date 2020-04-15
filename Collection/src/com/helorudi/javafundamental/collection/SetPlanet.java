package com.helorudi.javafundamental.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetPlanet {

    public static void main(String[] args) {
        // menggunakan HashSet
        Set<String> planets = new HashSet<>();

        // method add() untuk menambahkan objek ke Set
        planets.add("merkurius");
        planets.add("venus");
        planets.add("bumi");
        // menambahkan objek "bumi" beberapa kali
        planets.add("bumi");
        planets.add("bumi");
        planets.add("mars");
        // objek bisa terus ditambahkan ke Set

        // method size() untuk mendapatkan ukuran Set
        System.out.println("Set planet awal: (size = " + planets.size() + ")");
        for (String planet : planets) {
            System.out.println("\t " + planet);
        }

        // method remove() untuk mengeluarkan objek dari Set
        planets.remove("venus");

        System.out.println("Set planet awal: (size = " + planets.size() + ")");
        for (Iterator iterator = planets.iterator(); iterator.hasNext(); ) {
            // looping menggunakan Iterator
            System.out.println("\t " + iterator.next());
        }
    }
}
