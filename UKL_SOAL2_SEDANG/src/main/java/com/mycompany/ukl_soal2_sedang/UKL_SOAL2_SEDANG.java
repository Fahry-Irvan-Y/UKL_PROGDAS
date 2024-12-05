/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ukl_soal2_sedang;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class UKL_SOAL2_SEDANG {

    public static double hitungLuasPermukaan(double input) { //fungsi luas permukaan bola
        return 4 * 3.14 * input * 2;
    }

    public static double hitungluaslingkaran(double input_LL) {
        return 3.14 * input_LL * input_LL;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selamat datang di Perhitungan luas permukaan Bola ");

        // Meminta input jari-jari satuan cm
        System.out.print("Masukkan jari-jari bola (satuan cm): ");
        double input = scanner.nextDouble();

        // Memanggil fungsi
        double luasPermukaan = hitungLuasPermukaan(input);

        // Menampilkan hasil
        System.out.print("Luas permukaan bola dengan jari-jari " + input + " adalah = " + luasPermukaan);

        //meminta input jari-jari lingkaran
        System.out.print("Masukkan jari-jari lingkaran (satuan = cm) = ");
        double input_LL = scanner.nextDouble();

        //Memanggil fungsi 
        double luaslingkaran = hitungluaslingkaran(input_LL);

        //Menampilkan hasil
        System.out.println("Luas lingkaran dengan jari-jari " + input_LL + " Adalah = " + luaslingkaran);

    }
}
