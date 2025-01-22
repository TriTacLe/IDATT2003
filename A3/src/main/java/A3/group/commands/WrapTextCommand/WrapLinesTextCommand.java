package A3.group.commands.WrapTextCommand;

import A3.group.commands.TextCommandBase.WrapTextCommand;

public class WrapLinesTextCommand extends WrapTextCommand {
  public WrapLinesTextCommand(String opening, String end) {
    super(opening, end);
  }
  
  @Override
  public String execute(String text){
    return opening + text + end;
  }
}
