/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ukl_soal1_susah;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class UKL_SOAL1_SUSAH {

    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          System.out.println("Jumlah hari masuk 1 bulan adalah 26 HARI");
        System.out.print("Masukkan jumlah siswa yang ingin di input : ");
            int jumlahSiswa = scanner.nextInt();

            int[] kehadiran = new int[jumlahSiswa];
            int totalKehadiran = 0;
            int jumlahHariKerja = 26;

            for (int i = 0; i < jumlahSiswa; i++) {
                System.out.print("Masukkan jumlah hari hadir siswa ke-" + (i + 1) + " : ");
                kehadiran[i] = scanner.nextInt();
                if(kehadiran[i] <= 26){
                totalKehadiran += kehadiran[i];
                }else if(kehadiran[i] >= 26){
                    System.out.println("Mohon Maaf, input anda melebihi jumlah hari yaitu (26)");
                    System.exit(0);
                }
            }

            double rataRataKehadiran = totalKehadiran / jumlahSiswa;

            System.out.println("\nRekap Kehadiran Siswa Selama 1 Bulan (Jumlah Hari Kerja : " + jumlahHariKerja + " Hari):");
            for (int i = 0; i < jumlahSiswa; i++) {
                System.out.println("Siswa ke-" + (i + 1) + ": " + kehadiran[i] + " hari hadir");
            }

            System.out.println("\n Rata-rata kehadiran siswa:"+ rataRataKehadiran);

            System.out.println("\nKesimpulan:");
            System.out.println("Siswa yang kehadirannya di atas rata-rata:");
            for (int i = 0; i < jumlahSiswa; i++) {
                if (kehadiran[i] > rataRataKehadiran) {
                    System.out.println("Siswa ke-" + (i + 1) + " (" + kehadiran[i] + " hari)");
                }
            }

            System.out.println("\nSiswa yang kehadirannya di bawah rata-rata:");
            for (int i = 0; i < jumlahSiswa; i++) {
                if (kehadiran[i] < rataRataKehadiran) {
                    System.out.println("Siswa ke-" + (i + 1) + " (" + kehadiran[i] + " hari)");
                }
            }
        System.out.println("Terima Kasih..");    
    }

    }

