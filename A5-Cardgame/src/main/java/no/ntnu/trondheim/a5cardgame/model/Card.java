package main.java.no.ntnu.trondheim.a5cardgame.model;
import main.java.no.ntnu.trondheim.a5cardgame.model.Suit;
import main.java.no.ntnu.trondheim.a5cardgame.model.Rank;
public class Card {
  private final Suit suit;
  private final Rank rank;

  public Card(Suit suit, Rank rank) {
    this.suit = suit;
    this.rank = rank;
  }

  public Suit getSuit() {
    return suit;
  }
  public Rank getRank() {
    return rank;
  }
}
