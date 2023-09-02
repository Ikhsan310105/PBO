package com.mycompany.constants;

public class Constants2 {
    //Menggunakan public static final double agar dapat digunakan pada class lain sebagai variabel global
    public static final double CM_PER_INCH = 2.54; 
    public static void main(String[] args) {
        double paperWidth = 8.5; 
        double paperHeight = 11; 
        System.out.println("Paper size in centimeters: " + paperWidth *
        CM_PER_INCH + " by " + paperHeight * CM_PER_INCH); 
    }     
}
