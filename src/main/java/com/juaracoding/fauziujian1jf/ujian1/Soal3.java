package com.juaracoding.fauziujian1jf.ujian1;

import java.util.Scanner;

public class Soal3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Silahkan masukan jumlah tiket yang dibeli:");
        int jumlahTiket = scanner.nextInt();

        System.out.print("Apakah anda pesan di hari weekday? (ya/no):");
        String hari = scanner.next();

        double hargaTiket;
        if (hari.equalsIgnoreCase("ya")) {
            hargaTiket = 35000;
        } else {
            hargaTiket = 45000;
        }

        double totalHarga;
        if (jumlahTiket > 5) {
            double diskon = 0.1 * jumlahTiket * hargaTiket;
            totalHarga = jumlahTiket * hargaTiket - diskon;
        } else {
            totalHarga = jumlahTiket * hargaTiket;
        }

        System.out.println("Jumlah tiket : " + jumlahTiket);
        System.out.println("Total harga (dengan diskon): " + totalHarga);
    }
}
