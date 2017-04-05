package com.example.dan.learnjava;

/**
 * Created by dan on 3/8/17.
 */

public class Demo {
    public static void main(String[] args) {
        VampyreKing drac = new VampyreKing("Dracula");
        drac.showInfo();
        while (drac.getLives() > 0) {
            if (drac.dodges()) {
                continue;
            }
            if (drac.runAway()) {
                System.out.println("Dracula ran away");
                break;
            } else {
                drac.takeDamage(20);
                drac.showInfo();
            }
        }
    }

}
