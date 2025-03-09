package main.java.no.ntnu.trondheim.a5cardgame.model;

import java.util.ArrayList;
import java.util.Random;

/**
 * Oppgave 2.
 * A class to represent a deck of cards
 *
 * @author trile
 * @version 1.0
 * @since 1.0
 */
public class DeckOfCards {
  private ArrayList<Card> deckOfCards;

  /**
   * Constructor to make all the 52 cards
   */
  public DeckOfCards() {
    for (Suit suit : Suit.values()) { //4
      for (Rank rank : Rank.values()) { //13
        Card card = new Card(suit, rank);
        deckOfCards.add(card);
      }
    }
  }

  public ArrayList<Card> getDeckOfCards() {
    return deckOfCards;
  }

  /**
   * Oppgave 3.
   * Deals a hand of n cards. Minimunt antall kort er 5.
   * Trekker n tilfeldig kort fra kortstokken og returnerer de i en arraylist.
   *
   * @param n number of cards to deal
   * @return ArrayList of cards
   */
  public ArrayList<Card> dealHand(int n) {
    if (n > deckOfCards.size() || n < 5 || n > 52) {
      throw new IllegalArgumentException("Number of cards to deal must be between 5 and 52");
    }

    ArrayList<Card> hand = new ArrayList<>();
    Random random = new Random();

    for (int i = 0; i < n; i++) {
      int randomIndex = random.nextInt(deckOfCards.size());
      hand.add(deckOfCards.get(randomIndex));
    }
    return hand;
  }

  public void checkFlush(){

  }

  public void checkQueenOfSpades(){

  }

  public void sumOfFaces(){

  }

  public void checkHearts(){

  }
}

