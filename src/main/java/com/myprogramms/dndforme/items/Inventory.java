package com.myprogramms.dndforme.items;

import java.util.LinkedList;
import java.util.List;

public class Inventory {
    List<Item> items;

    public Inventory(List<Item> inventory) {
        this.items = inventory;
    }

    public Inventory(){
        this.items = new LinkedList<>();
    }
}
