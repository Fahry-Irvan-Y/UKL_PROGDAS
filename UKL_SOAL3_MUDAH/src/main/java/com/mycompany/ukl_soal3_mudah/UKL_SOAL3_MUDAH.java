/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ukl_soal3_mudah;

/**
 *
 * @author Lenovo
 */
public class UKL_SOAL3_MUDAH {

    public static void main(String[] args) {
        String[] kalimat = {
                "saya anak moklet",
                "saya anak wikusama",
                "saya angkatan 33"
            };

            for (int i = 34; i > 0; i--) {
                if (i == 1) {
                    System.out.println(i + ". saya senang");
                } else if (i % 3 == 0) {
                    System.out.println(i + ". " + kalimat[2]); // "saya angkatan 33"
                } else if (i % 2 == 0) {
                    System.out.println(i + ". " + kalimat[0]); // "saya anak moklet"
                } else {
                    System.out.println(i + ". " + kalimat[1]); // "saya anak wikusama"
                }
            }

    }
}
