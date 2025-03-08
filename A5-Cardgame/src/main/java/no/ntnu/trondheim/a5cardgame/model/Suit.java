package main.java.no.ntnu.trondheim.a5cardgame.model;

public enum Suit {
  HEARTS("hearts"),
  DIAMONDS("diamonds"),
  SPADES("spades"),
  CLUBS("clubs");

  private final String name;

  Suit(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
