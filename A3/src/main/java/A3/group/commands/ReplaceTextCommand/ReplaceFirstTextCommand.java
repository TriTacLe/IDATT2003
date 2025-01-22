package A3.group.commands.ReplaceTextCommand;

import A3.group.commands.TextCommandBase.ReplaceTextCommand;

public class ReplaceFirstTextCommand extends ReplaceTextCommand {

  public ReplaceFirstTextCommand(String target, String replacement) {
    super(target, replacement);
  }
  
  @Override
  public String execute(String text){
    return text.replaceFirst(target, replacement);
  }
}
