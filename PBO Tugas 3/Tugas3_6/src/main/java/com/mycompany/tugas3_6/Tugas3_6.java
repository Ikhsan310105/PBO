package com.mycompany.tugas3_6;

import java.util.Scanner;

public class Tugas3_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        
        //proses penginputan
        long input1 = sc.nextLong();
        long input2 = sc2.nextLong();
        
        //jika input kurang dari 0 maka invalid
        if(input1 < 0 || input2 < 0){
            System.err.println("Tidak Boleh negatif");
        }else{
            //print hasil penjumlahan lalu perkalian
            System.out.println("");
            System.out.println(input1 + input2);
            System.out.println(input1 * input2);
            
        }
        
    }
}
