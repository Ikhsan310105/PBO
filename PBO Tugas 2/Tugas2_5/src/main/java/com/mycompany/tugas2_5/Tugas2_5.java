package com.mycompany.tugas2_5;

import java.util.*;

public class Tugas2_5 {

    public static void main(String[] args) {
        
        Scanner huruf=new Scanner(System.in);
        
        //menginput string
        String A=huruf.next();
        String B=huruf.next();
        
        //mengassign panjang string dengan integer
        int lengthWord1 = A.length();
        int lengthWord2 = B.length();
        
        //jika hasil compare adalah 1 A lebih dari B maka hasilnya akan 1, sedangkan jika sama hasilnya 0, jika A kurang dari B maka hasilnya -1
        int lexi = A.compareTo(B);
        
        //proses penjumlahan semua huruf
        System.out.println(lengthWord1 + lengthWord2);
        
        //jika lexi = 1 dia akan yes, jika 0 atau -1 maka no
        if (lexi > 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");            
        }
        
        System.out.println( A.substring(0,1).toUpperCase() //Hanya mengambil huruf awal untuk di kapitalkan
                +A.substring(1,A.length())+" " //memasukkan huruf sisanya sampai panjang dari string tersebut lalu spasi
                +B.substring(0,1).toUpperCase() //Hanya mengambil huruf awal untuk di kapitalkan
                +B.substring(1,B.length()) ); //memasukkan huruf sisanya sampai panjang dari string tersebut.
        
    }
}
