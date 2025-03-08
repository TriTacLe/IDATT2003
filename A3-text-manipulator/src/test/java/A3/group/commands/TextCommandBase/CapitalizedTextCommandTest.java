package A3.group.commands.TextCommandBase;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for CapitalizedTextCommand.
 */
class CapitalizedTextCommandTest {
  
  @Test
  void testExecuteWithValidText() {
    
    String text = "hello world";
    CapitalizedTextCommand command = new CapitalizedTextCommand();
    
    String result = command.execute(text);
    
    assertEquals("Hello world", result, "The first character of the text should be capitalized.");
  }
  
  @Test
  void testExecuteWithAlreadyCapitalizedText() {
    
    String text = "Hello world";
    CapitalizedTextCommand command = new CapitalizedTextCommand();
    
    String result = command.execute(text);
    
    assertEquals("Hello world", result, "The text should remain the same if already capitalized.");
  }
  
  @Test
  void testExecuteWithSingleCharacterText() {
    String text = "a";
    CapitalizedTextCommand command = new CapitalizedTextCommand();
    
    String result = command.execute(text);
    
    assertEquals("A", result, "The single character should be capitalized.");
  }
  
  @Test
  void testExecuteWithWhitespaceText() {
    String text = "  hello world";
    CapitalizedTextCommand command = new CapitalizedTextCommand();
    
    String result = command.execute(text);
    
    assertEquals("  hello world", result, "The text should remain unchanged when leading whitespace is present.");
  }
}
