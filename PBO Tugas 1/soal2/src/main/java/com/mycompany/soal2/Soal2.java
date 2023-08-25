/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soal2;

/**
 *
 * @author USER
 */
public class Soal2 {

    public static void main(String[] args) {
        int i = 42; // Mendeklarasikan variabel int i dengan nilai 42
        
        // Jika i < 40, maka nilai s menjadi "life"
        // Jika i !< 40 dan i > 50, maka nilai s menjadi "universe"
        // Jika kedua kondisi sebelumnya tidak terpenuhi, nilai s menjadi "everything"
        String s = (i<40)?"life":(i>50)?"universe":"everything";
        
        System.out.println(s);// Menampilkan nilai dari string s
    }
}
