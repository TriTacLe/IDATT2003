package A3.group.commands.TextCommandBase;

import A3.group.commands.TextCommand;

public class WrapTextCommand implements TextCommand {
  protected String opening;
  protected String end;
  
  public WrapTextCommand(String opening, String end) {
    this.opening = opening;
    this.end = end;
  }
  
  @Override
  public String execute(String text){
    return opening + text + end;
  }
  
  public String getOpening(){
    return opening;
  }
  
  public String getEnd(){
    return end;
  }
}

