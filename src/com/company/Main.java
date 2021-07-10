package com.company;

public class Main {

    public static void main(String[] args) {
	Boss boss = new Boss(1000,90,"FireBall",100);
	Warrior warrior = new Warrior(400,50,"sword damage2x");
	warrior.setSwordDamage(40);
    Mental mental = new Mental(450,60,"Telekinesis",90);
    Magical magical = new Magical(400,80,"NatureKinesis",100);
        System.out.println("Boss " + "health: "+boss.health + ", damage "+ boss.damage + "powerDamage: "+
                boss.superPowerDamage);
        System.out.println("Warrior " + "health: "+warrior.health + ", damage "+warrior.damage + ", powerDamage: "+
                warrior.getSwordDamage());
        System.out.println("Mental " + "health: "+mental.health + ", damage "+ mental.damage + ", powerDamage: "+
                mental.superPowerDamage);
        System.out.println("Magical " + "health: "+magical.health + ", damage "+magical.damage + ", powerDamage: "+
                magical.superPowerDamage);
        System.out.println("______________________________________________________");






    }




}
