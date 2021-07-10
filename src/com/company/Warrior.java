package com.company;

public class Warrior extends Player{
    int swordDamage;

    public Warrior(int health, int damage, String powerName) {
        super(health, damage, powerName);
    }

    public int getSwordDamage() {
        return swordDamage;
    }

    public void setSwordDamage(int swordDamage) {
        this.swordDamage = swordDamage;
    }
}
