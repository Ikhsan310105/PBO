package com.mycompany.kelasdua;

class KelasSatu
{
    //proses print 11 setiap class digunakan
    {
        System.out.println(11);
    }
    
    //proses print saat inisialisasi static KelasSatu
    static
    {
        System.out.println(2);
    }
    
    //jika ada parameter maka print 3
    public KelasSatu(int i)
    {
        System.out.println(3);
    }
    
    //jika tidak ada parameter maka print 4
    public KelasSatu()
    {
        System.out.println(4);
    }
 }

class KelasDua
{
    //melakukan print 5 jika menggunakan class kelasDua
    {
        System.out.println(5);
    }
    
    //main pada source code
    public static void main(String[] args)
    {
        System.out.println(6);
        KelasSatu satu = new KelasSatu();  
        KelasSatu dua = new KelasSatu(10);
    }
 }
