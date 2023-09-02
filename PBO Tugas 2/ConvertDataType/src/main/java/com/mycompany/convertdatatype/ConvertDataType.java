package com.mycompany.convertdatatype;

public class ConvertDataType {
    static short methodOne(long l)
    {
        //Mengcasting nilai f menjadi integer yang awalnya 10.25 menjadi 10
        int i = (int) l;
        
        //Mengcasting nilai i menjadi short
        return (short)i; 
    }
    
    public static void main(String[] args)
    {
        double d = 10.25; //Variable d di definisikan dalam tipe double
        float f = (float) d; //Variable d di casting agar menjadi tipe float
        
        //mengcasting float menjadi long
        //Memanggunakan function methodOne untuk mengubah nilai f
        //setelah funtion berhasil dijalankan, nilai yang di returnkan di casting lagi menjadi byte
        byte b = (byte) methodOne((long) f); 
        System.out.println(b);
    }
}
