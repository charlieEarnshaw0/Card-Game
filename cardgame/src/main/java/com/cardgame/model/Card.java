package com.cardgame.model;

import com.cardgame.score.Score;

public abstract class Card {
    private int x;

    public Card() {
        this.x = x;
    }

    public abstract void process(Score x);
}
