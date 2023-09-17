package com.mycompany.inventori;

import com.mycompany.inventori.Barang;

public class Inventori {
    //mendefinisikan Barang merupakan class dari barangs
    Barang[] barangs;
    
    //melakukan inisialisasi barang berdasarkan id, nama, dan stok
    void initBarang() {
        barangs = new Barang[2];
        barangs[0] = new Barang("001", "Baju", 10);
        barangs[1] = new Barang("002", "Celana", 20);
    }
    
    //melakukan print barang, menggunakan getStock untuk menampilkan stok dari barang
    void showBarang() {
        System.out.println(barangs[0].nama_barang + "(" + barangs[0].getStok() + ")");
        System.out.println(barangs[1].nama_barang + "(" + barangs[1].getStok() + ")");
    }
    
    //melakukan operasi mulai dari inisialisasi, penambahan barang, dan menampilkan barang
    //menggunakan tambahStok untuk menambahkan stok
    void pengadaan() {
        initBarang();
        barangs[0].tambahStok(20);
        showBarang();
    }
    
    //main dari source code
    public static void main(String[] args) {
        Inventori beli = new Inventori();
        beli.pengadaan();
    }
}
