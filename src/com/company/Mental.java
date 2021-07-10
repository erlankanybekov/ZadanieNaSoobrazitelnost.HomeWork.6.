package com.company;

import java.util.Random;

public class Mental extends Player{
    int superPowerDamage;

    public Mental(int health, int damage, String powerName, int superPowerDamage) {
        super(health, damage, powerName);
        this.superPowerDamage = superPowerDamage;
    }
    public void Telekinesis(){
        Random random = new Random();
        int power = random.nextInt(5);
        if (power > 1){
            System.out.println("Mental using Telekinesis");
        }
    }

}

