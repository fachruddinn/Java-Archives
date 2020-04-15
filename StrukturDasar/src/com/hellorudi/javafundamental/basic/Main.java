package com.hellorudi.javafundamental.basic;

import com.hellorudi.javafundamental.basic.kendaraan.Kereta;
import com.hellorudi.javafundamental.basic.kendaraan.Mobil;
import com.hellorudi.javafundamental.basic.kendaraan.Motor;
import com.hellorudi.javafundamental.basic.tas.Buku;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Halo Java");

        Buku.bergaris();

        Mobil.jumlahBan();
        Motor.jumlahBan();
        Kereta.jumlahBan();

        Date today = new Date();
        System.out.println("Hari ini = " + today);
        Date tomorrow = DateUtils.addDays(today, 1);
        System.out.println("Besok = " + tomorrow);
    }
}