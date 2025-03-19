package edu.ntnu.idatt2003.a5cardgame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Class that represent "kortstokK"
 */
class DeckOfCards {
  private final char[] suits = {'S', 'H', 'D', 'C'};
  private List<Card> cards;

  /**
   * Instantiates a new Deck of cards.
   */
  public DeckOfCards() {
    cards = new ArrayList<>();
    for (char suit : suits) {
      for (int value = 1; value <= 13; value++) {
        cards.add(new Card(suit, value));
      }
    }
  }

  /**
   * Deal hand list.
   *
   * @param n the n
   * @return the list
   */
  public List<Card> dealHand(int n) {
    Collections.shuffle(cards);
    return new ArrayList<>(cards.subList(0, n));
  }
}