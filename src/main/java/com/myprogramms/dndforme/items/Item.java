package com.myprogramms.dndforme.items;

public abstract class Item {
    private String name;
    private String description;
    private byte weight;
    private short cost;

    public Item(String name, String description, byte weight, short cost) {
        this.name = name;
        this.description = description;
        this.weight = weight;
        this.cost = cost;
    }

}
