package com.hellorudi.javafundamental.inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserBufferdReader {

    public static void main(String[] args) {

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.println("Program penjumlahan sederhana");
        int nilai1 = 0;
        int nilai2 = 0;
        try {
            System.out.print("Masukkan Angka Pertama : ");
            nilai1 = Integer.parseInt(bufferedReader.readLine());
            System.out.print("Masukkan Angka Kedua : ");
            nilai2 = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        int hasil = nilai1 + nilai2;
        System.out.println("Hasilnya adalah : " + hasil);
    }
}
