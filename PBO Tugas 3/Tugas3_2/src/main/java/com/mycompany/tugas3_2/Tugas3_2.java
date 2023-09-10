package com.mycompany.tugas3_2;

import java.util.Scanner;

public class Tugas3_2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Scanner sc2=new Scanner(System.in);
        Scanner sc3=new Scanner(System.in);
        
        //input dan pembagian int dan string
        String s1=sc.next();
        int x=sc.nextInt();
        String s2=sc2.next();
        int y=sc2.nextInt();
        String s3=sc3.next();
        int z=sc3.nextInt();

        System.out.println("================================"); 
        //print string dan int
        System.out.printf("%-15s", s1);
        System.out.printf("%03d%n", x );
        System.out.printf("%-15s", s2);
        System.out.printf("%03d%n", y );
        System.out.printf("%-15s", s3);
        System.out.printf("%03d%n", z);

        System.out.println("================================");

    }
}
