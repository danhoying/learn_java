package com.example.dan.learnjava;

/**
 * Created by dan on 3/8/17.
 */

public class Demo {
    public static void main(String[] args) {
        VampyreKing drac = new VampyreKing("Drac");
        drac.showInfo();
        while (drac.getLives() > 0) {
            drac.takeDamage(20);
            drac.showInfo();
        }
    }

}
