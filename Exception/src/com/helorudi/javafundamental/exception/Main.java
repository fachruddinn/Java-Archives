package com.helorudi.javafundamental.exception;

import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {

//        try {
//            // Mencoba membaca berkas latihan.txt
//            String location = "/Users/fachruddin/Learn/Java/latihan2.txt";
//            File file = new File(location);
//            FileReader fr = new FileReader(file);
//
//            //Jika berhasil maka tampikan pesan
//            System.out.println("Read file berhasil");
//
//        } catch (Exception e) {
//            // Jika terjadi kesalahan maka tampilkan pesan
//            System.out.println(e.getMessage());
//        }

        int[] a = new int[7];
        try {
            System.out.println("Akses elemen ke 7 :" + a[7]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown :" + e);
        } finally {
            a[2] = 8;
            System.out.println("Nilai elemen terakhir: " + a[2]);
        }
    }
}
