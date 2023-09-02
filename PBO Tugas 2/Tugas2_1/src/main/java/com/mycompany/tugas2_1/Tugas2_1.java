package com.mycompany.tugas2_1;
import java.util.Scanner;

public class Tugas2_1 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        int ipt = input.nextInt();
        
        for (int i = 1; i <= ipt; i++) {
            //melakukan looping agar bisa mengidentifikasi semua inputan
            //menggunakan try dan catch agar dapat melakukan print pada exceptionnya
            try {
                //menggunakan tipe data long karena yang bisa menampung angka paling banyak
                long number = num.nextLong();
                //Menggunakan min_value dan max_value agar mudah
                if (number >= Byte.MIN_VALUE && number <= Byte.MAX_VALUE) {
                    System.out.println("N can be fitted in:");
                    System.out.println("* byte");
                } else if (number >= Short.MIN_VALUE && number <= Short.MAX_VALUE) {
                    System.out.println("N can be fitted in:");
                    System.out.println("* byte");
                    System.out.println("* Short");
                } else if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE) {
                    System.out.println("N can be fitted in:");
                    System.out.println("* byte");
                    System.out.println("* Short");
                    System.out.println("* integer");
                } else if (number >= Long.MIN_VALUE && number <= Long.MAX_VALUE) {
                    System.out.println("N can be fitted in:");
                    System.out.println("* byte");
                    System.out.println("* Short");
                    System.out.println("* integer");
                    System.out.println("* long");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("N can't be fitted anywhere");
                num.nextLine();
            }
        }
        //scanner harus selalu di close
        num.close();
        input.close();
    }
}
