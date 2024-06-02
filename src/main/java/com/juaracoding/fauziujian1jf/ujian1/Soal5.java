package com.juaracoding.fauziujian1jf.ujian1;

import java.util.Scanner;

public class Soal5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] films = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Harga tiket film " + (i+1) + ": ");
            films[i] = scanner.nextInt();
        }


        int total = 0;
        for (int film : films) {
            total += film;
        }

        System.out.println("Total harga tiket : " + total);
    }

}
