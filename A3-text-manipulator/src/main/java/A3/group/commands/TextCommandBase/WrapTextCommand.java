package A3.group.commands.TextCommandBase;

import A3.group.commands.TextCommand;

public class WrapTextCommand implements TextCommand {
  protected String opening;
  protected String end;
  
  public WrapTextCommand(String opening, String end) {
    if (opening == null || opening.isBlank()) {
      throw new IllegalArgumentException("Opening cannot be null or empty");
    }
    if (end == null || end.isBlank()) {
      throw new IllegalArgumentException("End cannot be null or empty");
    }
    this.opening = opening;
    this.end = end;
  }
  
  @Override
  public String execute(String text) {
    if (text == null || text.isBlank()) {
      throw new IllegalArgumentException("Text cannot be null or empty");
    }
    return opening + text + end;
  }
  
  public String getOpening() {
    return opening;
  }
  
  public String getEnd() {
    return end;
  }
}

