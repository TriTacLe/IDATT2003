package A3.group.commands.ReplaceTextCommand;

import A3.group.commands.TextCommandBase.ReplaceTextCommand;

public class ReplaceFirstTextCommand extends ReplaceTextCommand {

  public ReplaceFirstTextCommand(String target, String replacement) {
    super(target, replacement);
  }
  
  @Override
  public String execute(String text){
    if(text == null || text.isBlank()){
      throw new IllegalArgumentException("Input text cannot be null or empty");
    }
    
    return text.replaceFirst(target, replacement);
  }
}
