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
    String target = "apple";
    String replacement = "orange";
    String text = "apple pie and apple juice";
    ReplaceTextCommand command = new ReplaceTextCommand(target, replacement);
    
    String result = command.execute(text);
    
    assertEquals("orange pie and orange juice", result, "All occurrences of the target word should be replaced.");
  }
  
  /**
   * CHATGPT generates the text prompt
   */
  @Test
  void testExecuteWithNoOccurrences() {
    String target = "dog";
    String replacement = "cat";
    String text = "The quick brown fox jumps over the lazy horse.";
    ReplaceTextCommand command = new ReplaceTextCommand(target, replacement);
    
    String result = command.execute(text);
    
    assertEquals("The quick brown fox jumps over the lazy horse.", result, "Text should remain unchanged if the target is not found.");
  }
  
  @Test
  void testExecuteWithEmptyTarget() {
    String target = "";
    String replacement = "hi";
    String text = "hello world";
    ReplaceTextCommand command = new ReplaceTextCommand(target, replacement);
    
    String result = command.execute(text);
    
    assertEquals("hihhiehilhilhiohi hiwhiohirhilhidhi", result, "Replacing an empty target inserts the replacement at every position.");
  }
  
  @Test
  void testExecuteWithEmptyReplacement() {
    String target = "hello";
    String replacement = "";
    String text = "hello world, hello universe";
    ReplaceTextCommand command = new ReplaceTextCommand(target, replacement);
    
    String result = command.execute(text);
    
    assertEquals(" world,  universe", result, "The target should be removed when the replacement is empty.");
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
