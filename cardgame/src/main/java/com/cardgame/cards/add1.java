package com.cardgame.cards;

import com.cardgame.score.Score;

public class add1 extends com.cardgame.model.Card {
    private String name = "add1";

    public void process(Score x) {
        x.setScore(x.getScore() + 1, name);
    }

}
