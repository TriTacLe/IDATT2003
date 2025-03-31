package edu.ntnu.idatt2003.a5cardgame;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Positive tests for the Card class.
 */
class CardPositiveTest {
  private Card card;

  /**
   * Sets up.
   */
  @BeforeEach
  void setUp() {
    card = new Card('H', 10);
  }

  /**
   * Test get suit.
   */
  @Test
  void testGetSuit() {
    assertEquals('H', card.getSuit());
  }

  /**
   * Test get value.
   */
  @Test
  void testGetValue() {
    assertEquals(10, card.getValue());
  }

  /**
   * Test to string.
   */
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

  /**
   * Sets up.
   */
  @BeforeEach
  void setUp() {
    card = new Card('Z', -1); // Invalid suit and value
  }

  /**
   * Test invalid suit.
   */
  @Test
  void testInvalidSuit() {
    assertNotEquals('H', card.getSuit());
  }

  /**
   * Test invalid value.
   */
  @Test
  void testInvalidValue() {
    assertNotEquals(10, card.getValue());
  }

  /**
   * Test to string with invalid values.
   */
  @Test
  void testToStringWithInvalidValues() {
    assertEquals("Z-1", card.toString());
  }
}