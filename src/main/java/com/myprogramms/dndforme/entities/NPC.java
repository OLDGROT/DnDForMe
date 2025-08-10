package com.myprogramms.dndforme.entities;

public class NPC extends Entity {
    private String name;
    private String role;
    private int level;
    private String description;

    public NPC(String name, String role, int level, String description) {
        this(name, role);
        this.description = description;
        this.level = level;
    }



    public NPC(String name, String role) {
        super();
        this.name = name;
        this.role = role;
    }

    public String getInfo() {
        return "NPC: " + name + ", роль: " + role + ", уровень: " + level + ", описание: " + description;
    }

}