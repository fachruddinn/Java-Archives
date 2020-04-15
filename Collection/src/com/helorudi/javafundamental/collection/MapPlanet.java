package com.helorudi.javafundamental.collection;

import java.util.HashMap;
import java.util.Map;

public class MapPlanet {

    public static void main(String[] args) {
        // menggunakan HashMap
        Map<String, Planet> planets = new HashMap<>();

        // method put() untuk menambahkan objek ke Map
        planets.put("key-1", new Planet("Merkurius", 0.06));
        planets.put("key-2", new Planet("Venus", 0.82));
        planets.put("key-3", new Planet("Bumi", 1.00));
        planets.put("key-4", new Planet("Mars", 0.11));

        // menambahkan ke Map dengan key yang sama
        planets.put("key-4", new Planet("Mars-X", 0.11));

        // method size() untuk mendapatkan ukuran Set
        System.out.println("Map planets awal: (size = " + planets.size() + ")");
        for (String key : planets.keySet()) {
            // method get() untuk melihat isi Map berdasarkan key
            System.out.println("\t " + key + " : " + planets.get(key));
        }

        // method remove() untuk mengeluarkan objek dari Map
        planets.remove("key-2");
        System.out.println("Map planets akhir: (size = " + planets.size() + ")");
        for (Planet planet : planets.values()) {
            // looping value dari Map
            System.out.println("\t " + planet);
        }
    }
}
