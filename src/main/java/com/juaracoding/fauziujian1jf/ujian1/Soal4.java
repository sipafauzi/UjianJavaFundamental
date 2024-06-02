package com.juaracoding.fauziujian1jf.ujian1;

import java.util.Scanner;

public class Soal4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] daftarFilm = new String[5];

        System.out.println("Daftar film bioskop");
        for (int i = 0; i < 5; i++) {
            System.out.print("Masukan nama film " + (i + 1) + ": ");
            daftarFilm[i] = scanner.nextLine();
        }

        System.out.println("\nFilm yang ingin ditonton:");
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + ". " + daftarFilm[i]);
        }

    }
}
