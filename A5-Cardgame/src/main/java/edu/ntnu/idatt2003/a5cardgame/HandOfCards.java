package edu.ntnu.idatt2003.a5cardgame;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Class that represent a hand of cards
 */
class HandOfCards {
  private List<Card> hand;

  /**
   * Instantiates a new Hand of cards.
   *
   * @param hand the hand
   */
  public HandOfCards(List<Card> hand) {
    this.hand = hand;
  }

  /**
   * Is flush boolean.
   *
   * @return the boolean
   */
  public boolean isFlush() {
    return hand.stream().map(Card::getSuit).distinct().count() == 1;
  }

  /**
   * Sum values int.
   *
   * @return the int
   */
  public int sumValues() {
    return hand.stream().mapToInt(Card::getValue).sum();
  }

  /**
   * Contains queen of spades boolean.
   *
   * @return the boolean
   */
  public boolean containsQueenOfSpades() {
    return hand.stream().anyMatch(card -> card.getSuit() == 'S' && card.getValue() == 12);
  }

  /**
   * Hearts in hand string.
   *
   * @return the string
   */
  public String heartsInHand() {
    List<String> hearts = hand.stream()
        .filter(card -> card.getSuit() == 'H')
        .map(Card::toString)
        .collect(Collectors.toList());
    return hearts.isEmpty() ? "No Hearts" : String.join(" ", hearts);
  }

  @Override
  public String toString() {
    return hand.stream().map(Card::toString).collect(Collectors.joining(" "));
  }
}