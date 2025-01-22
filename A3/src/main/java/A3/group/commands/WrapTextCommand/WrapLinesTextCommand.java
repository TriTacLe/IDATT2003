package A3.group.commands.WrapTextCommand;

import A3.group.commands.TextCommandBase.WrapTextCommand;

public class WrapLinesTextCommand extends WrapTextCommand {
  public WrapLinesTextCommand(String opening, String end) {
    super(opening, end);
  }
  
  @Override
  public String execute(String text) {
    if (text == null || text.isBlank()){
      throw new IllegalArgumentException("Text cannot be null/blank");
    }
    return opening + text + end;
  }
}
