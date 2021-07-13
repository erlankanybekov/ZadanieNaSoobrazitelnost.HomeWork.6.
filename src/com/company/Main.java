package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss(1000, 90, "FireBall", 100);
        Warrior warrior = new Warrior(500, 50, " sword damage2x");
        warrior.setSwordDamage(40);
        Mental mental = new Mental(550, 90, "Telekinesis", 90);
        Magical magical = new Magical(500, 80, "NatureKinesis", 100);
        System.out.println("Boss " + "health: " + boss.health + ", damage " + boss.damage + ", powerDamage: " +
                boss.superPowerDamage);
        System.out.println("Warrior " + "health: " + warrior.health + ", damage " + warrior.damage + ", powerDamage: " +
                warrior.getSwordDamage());
        System.out.println("Mental " + "health: " + mental.health + ", damage " + mental.damage + ", powerDamage: " +
                mental.superPowerDamage);
        System.out.println("Magical " + "health: " + magical.health + ", damage " + magical.damage + ", powerDamage: " +
                magical.superPowerDamage);
        System.out.println("______________________________________________________");

        int fight = 0;
        while (fight <= 3 && boss.health > 0) {
            fight++;
            warrior.health = warrior.health - boss.damage;
            mental.health = mental.health - boss.damage;
            magical.health = magical.health - boss.damage;
            boss.health = boss.health - warrior.getSwordDamage();
            boss.health = boss.health - mental.damage;
            boss.health = boss.health - magical.damage;
            System.out.println("Boss health: " + boss.health);
            System.out.println("Warrior health: " + warrior.health);
            System.out.println("Mental health: " + warrior.health);
            System.out.println("Magical health: " + magical.health);
            Random random = new Random();
            int PowerFight = random.nextInt(5);
            if (PowerFight > 1) {
                warrior.health = warrior.health - boss.superPowerDamage;
                mental.health = mental.health - boss.superPowerDamage;
                magical.health = magical.health - boss.superPowerDamage;
                boss.health = boss.health - mental.superPowerDamage;
                boss.health = boss.health - magical.superPowerDamage;
            }
            System.out.println("______________________________________");
            boss.FireBall();
            mental.Telekinesis();
            magical.NaturePower();
            System.out.println("_______________________________________");
            if (boss.health < 0){
                System.out.println("Heroes win");
            }


        }
    }
}

