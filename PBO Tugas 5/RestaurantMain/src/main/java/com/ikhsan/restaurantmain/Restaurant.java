package com.ikhsan.restaurantmain;

import java.util.logging.Logger;

public class Restaurant {
    private String[] namaMakanan;
    private double[] hargaMakanan;
    private int[] stok;
    int id = 0;
    private static final Logger logger = Logger.getLogger(Restaurant.class.getName());

    public Restaurant() {
        namaMakanan = new String[10];
        hargaMakanan = new double[10];
        stok = new int[10];
    }

    public void tambahMenuMakanan(String nama, double harga, int stok) {
        this.namaMakanan[id] = nama;
        this.hargaMakanan[id] = harga;
        this.stok[id] = stok;
        id++;
    }
    
    
    public void tampilMenuMakanan() {
        for (int i = 0; i < id; i++) {
            if (!isOutOfStock(i)) {
                String message = String.format("%s[%d]\tRp. %.2f",namaMakanan[i],stok[i],hargaMakanan[i]);
                logger.info(message);
            }
        }
    }
    
    public void pesanMenu(int id, int jumlah) {
        if (id >= 0 && id < namaMakanan.length) {
            if (stok[id] >= jumlah) {
                stok[id] -= jumlah;
                String message = String.format("Pesanan : %d %s", jumlah, namaMakanan[id]);
                logger.info(message);
            } else {
                logger.info("Stok tidak mencukupi");
            }
        } else {
            logger.info("Menu tidak valid.");
        }
    }
    
    public void hapusMenu(int id) {
        if (id >= 0 && id < namaMakanan.length) {
            namaMakanan[id] = null;
            hargaMakanan[id] = 0.0;
            stok[id] = 0;
            adjustMenu();
        } else {
            logger.info("Menu tidak valid.");
        }
    }
    
   private void adjustMenu() {
        int indexBaru = 0;
        for (int i = 0; i < namaMakanan.length; i++) {
            if (namaMakanan[i] != null) {
                namaMakanan[indexBaru] = namaMakanan[i];
                hargaMakanan[indexBaru] = hargaMakanan[i];
                stok[indexBaru] = stok[i];
                indexBaru++;
            }
        }
        id = indexBaru;
    }
   
    public boolean isOutOfStock(int id) {
        return stok[id] == 0;
    }
}
