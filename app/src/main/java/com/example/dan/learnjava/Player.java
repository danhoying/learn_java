package com.example.dan.learnjava;

/**
 * Created by dan on 3/3/17.
 */

public class Player {
    private String handleName;
    private int lives;
    private int level;
    private int score;
    private Weapon weapon;

    public Player() {
        this("Unknown player");
    }

    public Player(String handle) {
        this(handle, 1);
    }

    public Player(String handle, int startingLevel) {
//        this.handleName = handle;
//        this.lives = 3;
//        this.level = startingLevel;
//        this.score = 0;
        setHandleName(handle);
        setLives(3);
        setLevel(startingLevel);
        setScore(0);
    }

    public String getHandleName() {
        return handleName;
    }

    public void setHandleName(String handle) {
        if (handle.length() < 3) {
            System.out.println("The name " + handle + " is too short, must be 3 characters or more.");
            return;
        }
        this.handleName = handle;
    }

    public void setNameAndLevel(String name, int level) {
        this.handleName = name;
        this.level = level;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
