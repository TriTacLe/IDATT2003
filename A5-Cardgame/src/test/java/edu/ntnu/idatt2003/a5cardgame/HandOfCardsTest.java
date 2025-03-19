package edu.ntnu.idatt2003.a5cardgame;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Positive tests for the HandOfCards class.
 */
class HandOfCardsPositiveTest {
  private HandOfCards hand;

  /**
   * Sets up.
   */
  @BeforeEach
  void setUp() {
    hand = new HandOfCards(List.of(
        new Card('H', 2),
        new Card('H', 5),
        new Card('H', 7),
        new Card('H', 10),
        new Card('H', 12)
    ));
  }

  /**
   * Test is flush.
   */
  @Test
  void testIsFlush() {
    assertTrue(hand.isFlush());
  }

  /**
   * Test sum values.
   */
  @Test
  void testSumValues() {
    assertEquals(36, hand.sumValues());
  }

  /**
   * Test contains queen of spades.
   */
  @Test
  void testContainsQueenOfSpades() {
    assertFalse(hand.containsQueenOfSpades());
  }

  /**
   * Test hearts in hand.
   */
  @Test
  void testHeartsInHand() {
    assertEquals("H2 H5 H7 H10 H12", hand.heartsInHand());
  }
}

/**
 * Negative tests for the HandOfCards class.
 */
class HandOfCardsNegativeTest {
  private HandOfCards hand;

  /**
   * Sets up.
   */
  @BeforeEach
  void setUp() {
    hand = new HandOfCards(List.of(
        new Card('S', 3),
        new Card('H', 4),
        new Card('D', 5),
        new Card('C', 6),
        new Card('S', 12)
    ));
  }

  /**
   * Test is not flush.
   */
  @Test
  void testIsNotFlush() {
    assertFalse(hand.isFlush());
  }

  /**
   * Test sum values incorrect.
   */
  @Test
  void testSumValuesIncorrect() {
    assertNotEquals(50, hand.sumValues());
  }

  /**
   * Test contains queen of spades.
   */
  @Test
  void testContainsQueenOfSpades() {
    assertTrue(hand.containsQueenOfSpades());
  }

  /**
   * Test hearts in hand with no hearts.
   */
  @Test
  void testHeartsInHandWithNoHearts() {
    HandOfCards noHeartsHand = new HandOfCards(List.of(
        new Card('S', 1),
        new Card('D', 8),
        new Card('C', 13)
    ));
    assertEquals("No Hearts", noHeartsHand.heartsInHand());
  }
}
