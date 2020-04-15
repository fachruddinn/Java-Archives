package com.hellorudi.javabasic;

import java.util.Scanner;

class WorkTime {
    public static void main(String args[])
    {
        int x, y, z;

        System.out.println(" ");
        System.out.println("Menghitung waktu kerja seorang pegawai");
        System.out.println("Input waktu masuk kerja:");
        Scanner in = new Scanner(System.in);

        x = in.nextInt();

        System.out.println("Input waktu keluar kerja:");

        y = in.nextInt();
        z = y - x;

        System.out.println("Lama waktu kerja anda " + z + " jam");
    }
}

