package com.myprogramms.dndforme.entities;

import com.myprogramms.dndforme.items.Inventory;
import com.myprogramms.dndforme.properties.StatBlok;

public abstract class Entity {
    private StatBlok statBlok;
    private Inventory inventory;


    public Entity(){
        this.statBlok = new StatBlok();
        this.inventory = new Inventory();
    }


}
