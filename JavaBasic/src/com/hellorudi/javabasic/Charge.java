package com.hellorudi.javabasic;

import java.util.Scanner;

public class Charge {
    public static void main (String args[]) {
        int income, out, time, cost;

        System.out.println(" ");
        System.out.println("Menghitung biaya parkir berdasarkan lama parkir");
        System.out.println("Input waktu masuk parkir:");
        Scanner in = new Scanner(System.in);
        income = in.nextInt();
        System.out.println("Input waktu keluar parkir:");
        out = in.nextInt();

        if (income <= out) {
            time = out - income;
        } else
            time = (12 - income) + out;

        System.out.println("Lama waktu parkir anda " + time + " jam");

        if (time > 2) {
            cost = 2000 + ((time - 2) * 500);
        } else
            cost = 2000;

        System.out.println("Biayanya adalah " + cost);
    }
}
