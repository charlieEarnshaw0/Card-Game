package com.cardgame.cards;

import com.cardgame.score.Score;

public class minus1 extends com.cardgame.model.Card {
    private String name = "minus1";

    public void process(Score x) {
        x.setScore(x.getScore() - 1, name);
    }

}
