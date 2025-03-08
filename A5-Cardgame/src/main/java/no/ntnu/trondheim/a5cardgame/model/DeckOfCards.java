package main.java.no.ntnu.trondheim.a5cardgame.model;

import java.util.ArrayList;

public class DeckOfCards {
  private final char[] suit = {'H', 'D', 'S', 'C'}; // Hearts, Diamonds, Spades, Clubs
  private final ArrayList<Card> deckOfCard = new ArrayList<Card>(52);

  /**
   * Constructor to make all the 52 cards
   */
  public DeckOfCards(){
  }

  public char[] getSuit(){
    return suit;
  }
  public void shuffle(){

  }

  public Card dealHand(int n){


  }
}
