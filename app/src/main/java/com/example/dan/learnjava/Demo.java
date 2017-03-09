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

        Player louise = new Player("Louise");
        System.out.println(louise.getHandleName());

        Player gr8 = new Player("gr8", 9);
        System.out.println(gr8.getHandleName());
    }
}
