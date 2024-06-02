package com.juaracoding.fauziujian1jf.ujian1;

import java.util.Scanner;

public class Soal2 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama film: ");
        String input = scanner.nextLine();

        String uppercaseInput = input.toUpperCase();

        System.out.println("Nama film dalam huruf besar: " + uppercaseInput);
    }
}
