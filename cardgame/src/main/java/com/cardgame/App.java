package com.cardgame;

import java.util.ArrayList;
import java.util.List;

import com.cardgame.model.Card;

public class App {
    public static void main(String[] args) {

        // Create score
        com.cardgame.score.Score score = new com.cardgame.score.Score();

        // Create cards in deck
        List<Card> deck = new ArrayList<>();
        deck.add(new com.cardgame.cards.add1());
        deck.add(new com.cardgame.cards.multiply2());
        deck.add(new com.cardgame.cards.divide2());
        deck.add(new com.cardgame.cards.minus1());

        // Shuffle deck
        java.util.Collections.shuffle(deck);

        // Draw cards and process
        for (Card card : deck) {
            card.process(score);
        }

        // output score
        System.out.println("Score: " + score.getScore());

    }
}
