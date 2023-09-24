package com.ikhsan.restaurantmain;

import com.ikhsan.restaurantmain.Restaurant;

public class RestaurantMain {

    public static void main(String[] args) {
        Restaurant menu = new Restaurant();

        menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
        menu.tambahMenuMakanan("Gehu", 1_000, 20);
        menu.tambahMenuMakanan("Tahu", 1_000, 20);
        menu.tambahMenuMakanan("Molen", 1_000, 20);

        menu.tampilMenuMakanan();
        
        menu.pesanMenu(0, 5);
        menu.pesanMenu(1, 10);
        
        menu.hapusMenu(2);
        
        menu.tampilMenuMakanan();
    }
}
