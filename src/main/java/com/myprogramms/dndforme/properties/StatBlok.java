package com.myprogramms.dndforme.properties;

public class StatBlok {
    private short strength;
    private short physique;
    private short dexterity;
    private short intelligence;
    private short charisma;

    public StatBlok(short strength, short physique, short dexterity, short intelligence, short charisma) {
        this.strength = strength;
        this.physique = physique;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.charisma = charisma;
    }

    public StatBlok(){
        this.strength = 10;
        this.physique = 10;
        this.dexterity = 10;
        this.intelligence = 10;
        this.charisma = 10;
    }

    public short getStrength() {
        return strength;
    }

    public void setStrength(short strength) {
        this.strength = strength;
    }

    public short getPhysique() {
        return physique;
    }

    public void setPhysique(short physique) {
        this.physique = physique;
    }

    public short getDexterity() {
        return dexterity;
    }

    public void setDexterity(short dexterity) {
        this.dexterity = dexterity;
    }

    public short getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(short intelligence) {
        this.intelligence = intelligence;
    }

    public short getCharisma() {
        return charisma;
    }

    public void setCharisma(short charisma) {
        this.charisma = charisma;
    }
}
