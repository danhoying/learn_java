package com.example.dan.learnjava;

/**
 * Created by dan on 3/8/17.
 */

public class Demo {
    public static void main(String[] args) {
        Enemy enemy = new Enemy("Slime", 40, 3);
        enemy.showInfo();
        enemy.takeDamage(3);
        enemy.showInfo();
        enemy.takeDamage(38);
        enemy.showInfo();
    }
}
