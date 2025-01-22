package A3.group.commands.WrapTextCommand;

import A3.group.commands.TextCommandBase.WrapTextCommand;

public class WrapSelectionTextCommand extends WrapTextCommand {
  private final String selection;
  
  public WrapSelectionTextCommand(String opening, String end, String selection) {
    super(opening, end);
    this.selection = selection;
  }
  
  @Override
  public String execute(String text){
    return opening + selection + end;
  }
  public String getSelection(){
    return selection;
  }
}
