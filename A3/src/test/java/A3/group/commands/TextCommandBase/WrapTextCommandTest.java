package A3.group.commands.TextCommandBase;

import static org.junit.jupiter.api.Assertions.*;

import A3.group.commands.TextCommandBase.WrapTextCommand;
import org.junit.jupiter.api.Test;

class WrapTextCommandTest {
  
  @Test
  void testConstructorAndGetters() {
    String opening = "<";
    String end = ">";
    
    WrapTextCommand command = new WrapTextCommand(opening, end);
    
    assertEquals(opening, command.getOpening(), "Opening tag should match the constructor input.");
    assertEquals(end, command.getEnd(), "End tag should match the constructor input.");
  }
  
  @Test
  void testExecuteWithNormalText() {
    // Arrange
    String opening = "<";
    String end = ">";
    String text = "hello";
    WrapTextCommand command = new WrapTextCommand(opening, end);
    
    String result = command.execute(text);
    
    assertEquals("<hello>", result, "The text should be wrapped correctly.");
  }
  
  
  @Test
  void testExecuteWithSpecialCharacters() {
    String opening = "[";
    String end = "]";
    String text = "hello @world!";
    WrapTextCommand command = new WrapTextCommand(opening, end);
    
    String result = command.execute(text);
    
    assertEquals("[hello @world!]", result, "The text with special characters should be wrapped correctly.");
  }
}
