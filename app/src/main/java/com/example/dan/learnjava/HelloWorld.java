package com.example.dan.learnjava;

/**
 * Created by dan on 2/28/17.
 */

public class HelloWorld {
    public static void main(String[] args) {
        int lives = 3;
        boolean isGameOver = (lives < 1);
        System.out.println(isGameOver);

        if (isGameOver) {
            System.out.println("Game over!");
        } else {
            System.out.println("You're still alive!");
        }
    }
}
