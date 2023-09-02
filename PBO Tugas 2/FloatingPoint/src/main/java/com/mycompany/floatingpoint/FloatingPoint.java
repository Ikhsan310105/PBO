package com.mycompany.floatingpoint;

public class FloatingPoint{
    public static void main(String[] args){
        double x = 92.98; 
        int nx = (int) Math.round(x); //Menggunakan math.round dan casting int agar dapat membulatkan angka pada integer terdekat.
        System.out.print(nx);
    }
}

