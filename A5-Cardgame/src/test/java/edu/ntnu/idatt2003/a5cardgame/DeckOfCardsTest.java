package edu.ntnu.idatt2003.a5cardgame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Positive tests for the DeckOfCards class.
 */
class DeckOfCardsPositiveTest {
  private DeckOfCards deck;

  @BeforeEach
  void setUp() {
    deck = new DeckOfCards();
  }

  @Test
  void testDeckHas52Cards() {
    List<Card> allCards = deck.dealHand(52);
    assertEquals(52, allCards.size());
  }

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

  @BeforeEach
  void setUp() {
    deck = new DeckOfCards();
  }

  @Test
  void testDealHandWithZeroCards() {
    List<Card> hand = deck.dealHand(0);
    assertEquals(0, hand.size());
  }

  @Test
  void testDealHandWithMoreThan52Cards() {
    Exception exception = assertThrows(IndexOutOfBoundsException.class, () -> deck.dealHand(53));
    assertNotNull(exception);
  }
}