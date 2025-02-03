package com.cardgame.cards;

import com.cardgame.score.Score;

public class divide2 extends com.cardgame.model.Card {
    private String name = "divide2";

    public void process(Score x) {
        x.setScore(x.getScore() / 2, name);
    }

}
