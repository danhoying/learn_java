package com.example.dan.learnjava;

/**
 * Created by dan on 4/4/17.
 */

public class Vampyre extends Enemy {
    public Vampyre(String name) {
        super(name, 20, 3);
    }

    @Override
    public void takeDamage(int damage) {
        super.takeDamage(damage / 2);
    }
}
