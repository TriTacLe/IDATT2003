package main.java.no.ntnu.trondheim.a5cardgame.model;

public class Player {
  private final String name = "Antony";
  private Hand hand;

  public Player(Hand hand) {
    this.hand = hand;
  }
}
