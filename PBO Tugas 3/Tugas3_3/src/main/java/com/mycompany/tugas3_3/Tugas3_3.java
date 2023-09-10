package com.mycompany.tugas3_3;

import java.util.Scanner;

public class Tugas3_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        //membagi input berdasarkan spasi
        String[] bagian = input.split(" ");
        
        //membuat jika input tidak memiliki 3 kata maka invalid
        if(bagian.length !=3){
            System.err.println("Invalid");
            System.exit(0);
        }
        
        //membagi antara operand dan operator
        int operand1 = Integer.parseInt(bagian[0]);
        String operator = bagian[1];
        int operand2 = Integer.parseInt(bagian[2]);
        
        //proses operasi sesuai dengan operator
        if (operator.equals("*")){
            int result = operand1 * operand2;
            System.out.println(result);
        }else if(operator.equals("/")){
            int result = operand1 / operand2;
            System.out.println(result);
        }else if(operator.equals("+")){
            int result = operand1 + operand2;
            System.out.println(result);
        }else if(operator.equals("-")){
            int result = operand1 - operand2;
            System.out.println(result);
        }else if(operator.equals("%")){
            int result = operand1 % operand2;
            System.out.println(result);
        }else{
            System.out.println("Invalid");
        }
    }
}
