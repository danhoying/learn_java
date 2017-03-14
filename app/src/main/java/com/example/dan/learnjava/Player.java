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
        handleName = handle;
        lives = 3;
        level = startingLevel;
        score = 0;
    }

    public String getHandleName() {
        return handleName;
    }

    public void setHandleName(String handle) {
        if (handle.length() < 3) {
            return;
        }
        handleName = handle;
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
