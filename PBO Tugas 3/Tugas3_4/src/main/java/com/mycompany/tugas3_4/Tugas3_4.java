/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.tugas3_4;

import java.util.Scanner;

public class Tugas3_4 {

    public static void main(String[] args) {
        
        //mendefinisikan bonus harga dan gaji pokoknya
        int bonus = 5000;
        int pokok = 500000;
        int harga = 50000;
        
        
        Scanner sc = new Scanner(System.in);
        long input = sc.nextLong();
        
        //melakukan perhitungan gaji sesuai jumlah yang di inputkan
        if(input >= 40 && input <= 80){
            long gaji = pokok + harga * input * 25 / 100;
            System.out.println(gaji);
        }else if (input > 80){
            long gaji = pokok + harga * input * 35 / 100;
            System.out.println(gaji);
        }else if (input < 15 && input > 0){
            long potong = 15 - input;
            long gaji = pokok - harga * potong * 15 / 100;
            System.out.println(gaji);
        }else if (input >= 15 && input < 40){
            long gaji = pokok + bonus * input;
            System.out.println(gaji);
        }else{
            System.err.println("Inputan Salah");
        }
    }
}
