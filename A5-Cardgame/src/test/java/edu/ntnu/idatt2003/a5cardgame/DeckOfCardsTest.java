package edu.ntnu.idatt2003.a5cardgame;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Positive tests for the DeckOfCards class.
 */
class DeckOfCardsPositiveTest {
  private DeckOfCards deck;

  /**
   * Sets up.
   */
  @BeforeEach
  void setUp() {
    deck = new DeckOfCards();
  }

  /**
   * Test deck has 52 cards.
   */
  @Test
  void testDeckHas52Cards() {
    List<Card> allCards = deck.dealHand(52);
    assertEquals(52, allCards.size());
  }

  /**
   * Test deal hand returns correct number of cards.
   */
  @Test
  void testDealHandReturnsCorrectNumberOfCards() {
    List<Card> hand = deck.dealHand(5);
    assertEquals(5, hand.size());
  }
}

/**
 * Negative tests for the DeckOfCards class.
 */
class DeckOfCardsNegativeTest {
  private DeckOfCards deck;

  /**
   * Sets up.
   */
  @BeforeEach
  void setUp() {
    deck = new DeckOfCards();
  }

  /**
   * Test deal hand with zero cards.
   */
  @Test
  void testDealHandWithZeroCards() {
    List<Card> hand = deck.dealHand(0);
    assertEquals(0, hand.size());
  }

  /**
   * Test deal hand with more than 52 cards.
   */
  @Test
  void testDealHandWithMoreThan52Cards() {
    Exception exception = assertThrows(IndexOutOfBoundsException.class, () -> deck.dealHand(53));
    assertNotNull(exception);
  }
}