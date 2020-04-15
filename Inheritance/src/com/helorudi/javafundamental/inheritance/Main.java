package com.helorudi.javafundamental.inheritance;

public class Main {
    public static void main(String[] args) {
//        Hewan hewan = new Hewan(); // memanggil constructor
//        System.out.println("Apakah hewan IS-A Objek -> " + (hewan instanceof Object));
//        System.out.println("Apakah hewan IS-A Hewan -> " + (hewan instanceof Hewan));
//        System.out.println("Apakah hewan IS-A Kucing -> " + (hewan instanceof Kucing));
//
//        System.out.println("------------------------");
//
//        Kucing kucing = new Kucing(); // memanggil constructor
//        System.out.println("Apakah kucing IS-A Objek -> " + (kucing instanceof Object));
//        System.out.println("Apakah kucing IS-A Hewan -> " + (kucing instanceof Hewan));
//        System.out.println("Apakah kucing IS-A Kucing -> " + (kucing instanceof Kucing));
//
//        System.out.println("------------------------");
//
//        hewan.makan(); // kucing mewarisi metode makan()
//        kucing.makan();
//        kucing.makan("daging ikan");
//
//        System.out.println("------------------------");
//
//        Kucing meow = new Kucing("Ocicat", "tropis");
//        Kucing puss = new Kucing("Ocicat", "subtropis");
//        Kucing popo = new Kucing("Anggora", "subtropis");
//
//        System.out.println(meow.toString());
//        System.out.println(puss.toString());
//        System.out.println(popo.toString());
//
//        System.out.println("meow equals puss ? " + meow.equals(puss));
//        System.out.println("meow equals popo ? " + meow.equals(popo));
//
//        System.out.println("------------------------");
//
//        Object o = new Kucing("Putih", "kota"); // kucing adalah Object
//        Hewan h = new Kucing("Hitam", "kota besar"); // kucing adalah Hewan
//        Kucing k = new Kucing("Coklat", "Istana"); // kucing adalah Kucing, pastinya :)
//
//        // o.makan(); -> error, karena method makan() tidak ada di class Object
//        h.makan();
//        k.makan();
//
//        Object object = k; // bisa langsung di assign
//        Hewan hewanK = k; // bisa langsung di assign
//
//        // object.makan(); -> error, karena method makan() tidak ada di class Object
//        hewanK.makan();
//
//        Hewan harimau = new Hewan();
////        Kucing anggora = (Kucing) harimau; // compile OK tetapi runtime error ClassCastException
//
//        System.out.println(o.toString());
//        System.out.println(h.toString());
//        System.out.println(k.toString());

        String s1 = "A";
        String s2 = "A";
//        System.out.println("s1 == s2" + s1 == s2);
        System.out.println("nilai s1 = s2 is " + s1.equals(s2));
    }
}
