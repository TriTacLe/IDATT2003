package main.java.no.ntnu.trondheim.a5cardgame.model;

public class Card {
  private final char suit;
  private final int rank;

  public Card(char suit, int rank) {
    this.suit = suit;
    this.rank = rank;
  }

  public char getSuit() {
    return suit;
  }
  public int getRank() {
    return rank;
  }
}
