package A3.group.commands.TextCommandBase;

import A3.group.commands.TextCommand;

public class ReplaceTextCommand implements TextCommand {
  protected String target;
  protected String replacement;
  
  public ReplaceTextCommand(String target, String replacement){
    this.target = target;
    this.replacement = replacement;
  }
  
  @Override
  public String execute(String text){
    return text.replace(target, replacement);
  }
  
  public String getTarget(){
    return target;
  }
  
  public String getReplacement(){
    return replacement;
  }
}
