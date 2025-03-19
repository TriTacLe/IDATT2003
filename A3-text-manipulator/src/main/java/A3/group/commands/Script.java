package A3.group.commands;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Script {
  private final List<TextCommand> textCommands;
  
  public Script(List<TextCommand> textCommands) {
    this.textCommands = textCommands;
  }
  
  /**
   * Executes text commands
   *
   * @param text text
   * @return text
   */
  public String execute(String text) {
    if (text == null || text.isBlank()) {
      throw new IllegalArgumentException("Input text cannot be null or empty");
    }
    for (TextCommand command : textCommands) {
      text = command.execute(text);
    }
    return text;
  }
}