package com.hellorudi.javafundamental.inputoutput;

import java.io.*;

public class Main {
    public static void main(String[] args) {

/*//        FileInputStream in = null;
//        FileOutputStream out = null;

        FileReader in = null;
        FileWriter out = null;

        try {
//            in = new FileInputStream("/Users/fachruddin/Learn/Java/latihan_input.txt");
//            out = new FileOutputStream("/Users/fachruddin/Learn/Java/latihan_output.txt");
            in = new FileReader("/Users/fachruddin/Learn/Java/latihan_input.txt");
            out = new FileWriter("/Users/fachruddin/Learn/Java/latihan_output.txt");
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/

        /*// Membuat direktori dengan nama folder latihan1
        String dirname = "/Users/fachruddin/Learn/Java/latihan1";
        File file = new File(dirname);

        // Buat directory
        file.mkdirs();*/


        // Menampilkan list file dari direktori
        String dirname = "/Users/fachruddin/Learn/Java/latihan1";
        File file = null;
        String[] paths;

        try {
            // Instansiasi objek File
            file = new File(dirname);

            // Ambil list files dan masukkan ke string paths
            paths = file.list();

            //Tampilkan semua path yang ada
            for (String path : paths) {
                System.out.println(path);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
