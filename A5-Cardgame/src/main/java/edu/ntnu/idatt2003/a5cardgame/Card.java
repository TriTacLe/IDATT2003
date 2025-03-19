package edu.ntnu.idatt2003.a5cardgame;

/**
 * Class that represent a single card
 */
class Card {
  private char suit;
  private int value;

  /**
   * Instantiates a new Card.
   *
   * @param suit  the suit
   * @param value the value
   */
  public Card(char suit, int value) {
    this.suit = suit;
    this.value = value;
  }

  /**
   * Gets suit.
   *
   * @return the suit
   */
  public char getSuit() {
    return suit;
  }

  /**
   * Gets value.
   *
   * @return the value
   */
  public int getValue() {
    return value;
  }

  @Override
  public String toString() {
    return suit + String.valueOf(value);
  }
}