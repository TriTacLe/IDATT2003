package edu.ntnu.idatt2003.a5cardgame;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Positive tests for the Card class.
 */
class CardPositiveTest {
  private Card card;

  @BeforeEach
  void setUp() {
    card = new Card('H', 10);
  }

  @Test
  void testGetSuit() {
    assertEquals('H', card.getSuit());
  }

  @Test
  void testGetValue() {
    assertEquals(10, card.getValue());
  }

  @Test
  void testToString() {
    assertEquals("H10", card.toString());
  }
}

/**
 * Negative tests for the Card class.
 */
class CardNegativeTest {
  private Card card;

  @BeforeEach
  void setUp() {
    card = new Card('Z', -1); // Invalid suit and value
  }

  @Test
  void testInvalidSuit() {
    assertNotEquals('H', card.getSuit());
  }

  @Test
  void testInvalidValue() {
    assertNotEquals(10, card.getValue());
  }

  @Test
  void testToStringWithInvalidValues() {
    assertEquals("Z-1", card.toString());
  }
}