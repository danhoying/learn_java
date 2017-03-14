package com.example.dan.learnjava;

/**
 * Created by dan on 3/8/17.
 */

public class Demo {
    public static void main(String[] args) {
        Player dan = new Player();
        System.out.println(dan.getHandleName());
        dan.setNameAndLevel("Daniel", 5);
        System.out.println(dan.getHandleName());
        System.out.println("Level: " + dan.getLevel());
        System.out.println("Lives: " + dan.getLives());
    }
}
