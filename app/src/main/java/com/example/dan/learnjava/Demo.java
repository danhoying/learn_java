package com.example.dan.learnjava;

/**
 * Created by dan on 3/8/17.
 */

public class Demo {
    public static void main(String[] args) {
//        Enemy enemy = new Enemy("Slime", 40, 3);
//        enemy.showInfo();
//        enemy.takeDamage(3);
//        enemy.showInfo();
//        enemy.takeDamage(38);
//        enemy.showInfo();

        Troll uglyTroll = new Troll("Ugly Troll");
        uglyTroll.showInfo();
        uglyTroll.takeDamage(30);

        Vampyre vlad = new Vampyre("Vlad");
        vlad.showInfo();
        vlad.takeDamage(8);
        vlad.showInfo();
    }

}
