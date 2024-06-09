package com.juaracoding.fauziujian1jf.ujian2;

public class ATM {

    private double saldo;

    public ATM(double saldoAwal){ //untuk menginisialisasi saldo awal
        saldo = saldoAwal;

    }

    public double lihatSaldo(){ // untuk melihat saldo saati ini
        return saldo;
    }

    public void setorUang(double jumlah) { // untuk melakukan penyetoran uang
        if (jumlah <= 0) {
            throw new IllegalArgumentException("Jumlah yang dimasukkan tidak valid");
        }
        saldo += jumlah;
    }

    public void ambilUang(double jumlah) { // untuk melakukan ambil uang
        if (jumlah <= 0 || jumlah > saldo) {
            throw new IllegalArgumentException("Jumlah yang dimasukkan tidak valid atau melebihi saldo saat ini");
        }
        saldo -= jumlah;
    }
}
