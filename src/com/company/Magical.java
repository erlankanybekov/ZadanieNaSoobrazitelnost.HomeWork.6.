package com.company;

import java.util.Random;

public class Magical extends Player{
    int superPowerDamage;

    public Magical(int health, int damage, String powerName, int superPowerDamage) {
        super(health, damage, powerName);
        this.superPowerDamage = superPowerDamage;
    }
    public void NaturePower(){
        Random random = new Random();
        int power = random.nextInt(5);
        if (power == 1){
            System.out.println("Magical using Pyrokinesis");
        }
        if (power == 2){
            System.out.println("Magical using Hydrokinesis");
        }
        if (power == 3){
            System.out.println("Magical using Aerokinesis");
        }
        if (power == 4){
            System.out.println("Magical using Electrokinesis");
        }
    }

}
