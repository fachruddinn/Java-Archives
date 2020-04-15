package com.hellorudi.javabasic;

public class Number {
    public static void main(String args[]) {
        int a[]={1,2,6,4,23,5,23,234};

        System.out.println(" ");
        System.out.println("Menentukan bilangan ganjil, genap dan prima yang ada di array, array berisi angka 1,2,6,4,23,5,23,234");
        System.out.println(" ");
        System.out.println("Bilangan Ganjil:");
        for (int i=0; i<a.length; i++) {
            if (a[i]%2!=0) {
                System.out.println(a[i]);
            }
        }

        System.out.println(" ");
        System.out.println("Bilangan Genap:");
        for (int i=0; i<a.length; i++) {
            if (a[i]%2==0) {
                System.out.println(a[i]);
            }
        }

        System.out.println(" ");
        System.out.println("Bilangan Prima:");
        for (int i=0; i<a.length; i++) {
            boolean isPrime = true;
            if (a[i] == 1)
                isPrime = false;
            for (int j=2; j<=a[i]/2; j++) {
                if(a[i]%j==0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                System.out.println(a[i]);
        }
    }
}
