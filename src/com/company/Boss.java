package com.company;

import java.util.Random;

public class Boss extends Player {
    int superPowerDamage;

    public Boss(int health, int damage, String powerName, int superPowerDamage) {
        super(health, damage, powerName);
        this.superPowerDamage = superPowerDamage;
    }
    public void FireBall() {
        Random random = new Random();
        int fire = random.nextInt(5);
        if (fire > 1){
            System.out.println("Boss using FireBall");
        }
    }
}










