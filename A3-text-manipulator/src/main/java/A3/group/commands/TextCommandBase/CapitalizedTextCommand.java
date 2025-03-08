package A3.group.commands.TextCommandBase;

import A3.group.commands.TextCommand;

public class CapitalizedTextCommand implements TextCommand {
  
  @Override
  public String execute(String text){
    if (text == null || text.isEmpty()){
      throw new IllegalArgumentException("Text is empty/null");
    }
    
    char character = Character.toUpperCase(text.charAt(0));

    return character + text.substring(1);
  }
}
