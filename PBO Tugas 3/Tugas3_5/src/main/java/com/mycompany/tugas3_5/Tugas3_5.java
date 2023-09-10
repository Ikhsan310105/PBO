package com.mycompany.tugas3_5;

import java.util.Scanner;

public class Tugas3_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        //memisahkan string input berdasarkan spasi
        String[] bagian = input.split(" ");
        
        //jika input bukan 4 kata maka invalid
        if(bagian.length !=4){
            System.err.println("Invalid");
            System.exit(0);
        }
        
        //membagi input ke beberapa string
        String plat1 = bagian[0];
        String plat2 = bagian[1];
        String plat3 = bagian[2];
        String plat4 = bagian[3];
        
        //penggabungan string agar tidak ada spasi
        String gabung = plat1 + plat2 + plat3 + plat4;
        
        //mengubah string menjadi long lalu di mod 5
        long platGabung = Long.parseLong(gabung);
        long hasilAkhir = platGabung % 5;
        
        //jika hasil mod 0 maka berhenti, sebaliknya jalan
        if(hasilAkhir == 0){
            System.out.println("Berhenti");
        }else{
            System.out.println("Jalan");
        }
    }
}
