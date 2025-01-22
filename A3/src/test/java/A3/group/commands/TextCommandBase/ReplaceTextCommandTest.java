package A3.group.commands.TextCommandBase;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for ReplaceTextCommand.
 */
class ReplaceTextCommandTest {
  
  @Test
  void testExecuteWithValidReplacement() {
    String target = "hello";
    String replacement = "hi";
    String text = "hello world";
    ReplaceTextCommand command = new ReplaceTextCommand(target, replacement);
    
    String result = command.execute(text);
    
    assertEquals("hi world", result, "The target word should be replaced with the replacement text.");
  }
  
  @Test
  void testExecuteWithMultipleOccurrences() {
    String target = "eple";
    String replacement = "orange";
    String text = "eple kule and apple juice";
    ReplaceTextCommand command = new ReplaceTextCommand(target, replacement);
    
    String result = command.execute(text);
    
    assertEquals("orange kule and apple juice", result, "All occurrences of the target word should be replaced.");
  }
  
  /**
   * CHATGPT generates the text prompt
   */
  @Test
  void testExecuteWithNoOccurrences() {
    String target = "hei";
    String replacement = "hallo";
    String text = "lorem hei ipsum dolor sit amet consectetur adipiscing elit";
    ReplaceTextCommand command = new ReplaceTextCommand(target, replacement);
    
    String result = command.execute(text);
    
    assertEquals("lorem hallo ipsum dolor sit amet consectetur adipiscing elit", result, "Text should remain unchanged if the target is not found.");
  }
  
  

  
  @Test
  void testGetTarget() {
    
    String target = "æøå";
    String replacement = "æøåklndkad";
    ReplaceTextCommand command = new ReplaceTextCommand(target, replacement);
    
    String result = command.getTarget();
    
    assertEquals("æøå", result, "getTarget should return the correct target value.");
  }
  
  @Test
  void testGetReplacement() {
    String target = "1234";
    String replacement = "æøå";
    ReplaceTextCommand command = new ReplaceTextCommand(target, replacement);
    
    String result = command.getReplacement();
    
    assertEquals("æøå", result, "getReplacement should return the correct replacement value.");
  }
}
