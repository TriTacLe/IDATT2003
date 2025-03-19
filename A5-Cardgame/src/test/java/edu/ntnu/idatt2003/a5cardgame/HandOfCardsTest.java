package edu.ntnu.idatt2003.a5cardgame;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Positive tests for the HandOfCards class.
 */
class HandOfCardsPositiveTest {
  private HandOfCards hand;

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

  @Test
  void testIsFlush() {
    assertTrue(hand.isFlush());
  }

  @Test
  void testSumValues() {
    assertEquals(36, hand.sumValues());
  }

  @Test
  void testContainsQueenOfSpades() {
    assertFalse(hand.containsQueenOfSpades());
  }

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

  @Test
  void testIsNotFlush() {
    assertFalse(hand.isFlush());
  }

  @Test
  void testSumValuesIncorrect() {
    assertNotEquals(50, hand.sumValues());
  }

  @Test
  void testContainsQueenOfSpades() {
    assertTrue(hand.containsQueenOfSpades());
  }

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
