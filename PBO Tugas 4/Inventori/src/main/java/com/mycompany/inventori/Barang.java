package com.mycompany.inventori;

public class Barang {
    
    String kode_barang;
    String nama_barang;
    
    //membungkus stok dengan private agar tidak bisa diubah sembarangan
    private int stok;
    
    //proses assign kode, nama, dan stk
    public Barang(String kode, String nama, int stk) {
        this.kode_barang = kode;
        this.nama_barang = nama;
        this.stok = stk;
    }
    
    //proses tambahStock, jika yang ditambahkan kurang dari 1 akan dianggap tidak valid
    public void tambahStok(int jumlah) {
        if (jumlah > 0) {
            stok += jumlah;
            System.out.println("barang berhasil di tambahkan");
        } else {
            System.out.println("jumlah barang tidak valid");
        }
    }
    
    //menggunakan getStok untuk mengambil nilai dari stok
    public int getStok() {
        return stok;
    }
}
