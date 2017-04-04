package com.example.dan.learnjava;

/**
 * Created by dan on 4/4/17.
 */

public class VampyreKing extends Vampyre {
    public VampyreKing(String name) {
        super(name);
        setHitPoints(140);
    }

    @Override
    public void takeDamage(int damage) {
        super.takeDamage(damage / 2);
    }
}
