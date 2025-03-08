package main.java.no.ntnu.trondheim.a5cardgame.model;

import java.util.ArrayList;
import java.util.Random;

/**
 *  A class to represent a deck of cards
 * @version 1.0
 * @since 1.0
 * @author trile
 */
public class DeckOfCards {
  private ArrayList<Card> deckOfCards;

  /**
   * Constructor to make all the 52 cards
   */
  public DeckOfCards(){
    for(Suit suit : Suit.values()){ //4
      for(Rank rank : Rank.values()){ //13
        Card card = new Card(suit, rank);
        deckOfCards.add(card);
      }
    }
  }

  public ArrayList<Card> getDeckOfCards(){
    return deckOfCards;
  }
  public void shuffle(){

  }

  /**
   * Deals a hand of n cards
   * @param n number of cards to deal
   * @return ArrayList of cards
   */
  public ArrayList<Card> dealHand(int n){
    if (n > deckOfCards.size() || n < 1 || n > 52){
      throw new IllegalArgumentException("Not enough cards in the deck");
    }

    ArrayList<Card> hand = new ArrayList<>();
    Random random = new Random();

    for (int i = 0; i < n; i++){
      int randomIndex = random.nextInt(deckOfCards.size());
      hand.add(deckOfCards.get(randomIndex));
    }

    return hand;
    }
  }
}
