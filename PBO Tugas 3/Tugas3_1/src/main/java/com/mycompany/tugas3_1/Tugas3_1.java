package com.mycompany.tugas3_1;

import java.util.*;


public class Tugas3_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        //jika tidak ada inputan maka 0
        if (!sc.hasNext()){
            System.out.println(0);
        }else{
            //menginputkan inputan
            String input=sc.nextLine();
            
            //memecah inputan dari beberapa karakter yaitu [ !,?._'@]+
            String[]a = input.trim().split("[ !,?._'@]+");
            
            //mengubah array menjadi arrayList
            ArrayList<String>listOfStrings =new ArrayList<String>(Arrays.asList(a));
            
            //mencetak jumlah kata dalam string
            System.out.println(listOfStrings.size());
            
            for(String str:listOfStrings){
                //mencetak string sampai habis
                System.out.println(str);
            }    
        }
    }
}
