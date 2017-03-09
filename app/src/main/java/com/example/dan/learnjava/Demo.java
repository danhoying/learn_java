package com.example.dan.learnjava;

/**
 * Created by dan on 3/8/17.
 */

public class Demo {
    public static void main(String[] args) {
        Player dan = new Player();
        System.out.println(dan.getHandleName());
        dan.setHandleName("Dan");
        System.out.println(dan.getHandleName());
        System.out.println("Level: " + dan.getLevel());
        System.out.println("Lives: " + dan.getLives());

        Player louise = new Player("Louise");
        System.out.println(louise.getHandleName());
        louise.setLives(5);
        System.out.println("Level: " + louise.getLevel());
        System.out.println("Lives: " + louise.getLives());

        Player gr8 = new Player("gr8", 9);
        System.out.println(gr8.getHandleName());
        System.out.println("Level: " + gr8.getLevel());
        System.out.println("Lives: " + gr8.getLives());
    }
}
