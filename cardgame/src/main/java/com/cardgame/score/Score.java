package com.cardgame.score;

public class Score {
    private int score;

    public Score() {
        this.score = 0;
    }

    public void setScore(int score, String name) {
        System.out.println("Applying " + name + " to the score. Current score: " + this.score);
        this.score = score;
        System.out.println("Score is now: " + this.score);
    }

    public int getScore() {
        return this.score;
    }
}
