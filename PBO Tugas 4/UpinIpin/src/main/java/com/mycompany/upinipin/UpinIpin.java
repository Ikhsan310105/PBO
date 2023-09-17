package com.mycompany.upinipin;

public class UpinIpin {
    //main pada source code mengassign name dengan upin
    public static void main(String[] args) {
        Item name = new Item("upin");
    }
}

//menghapus public karena dalam 1 source code hanya bisa 1 public class
class Item {
    private String name;

    private Item() {
        name = "Ipin";
    }
    
    //menambahkan this agar mengetahui this yang ditunjuk adalah yang berada dalam class
    //membuat output name menjadi Ipin
    public Item(String name) {
        this();
        System.out.println(this.name);
    }
}
