package A3.group.commands.WrapTextCommand;

import A3.group.commands.TextCommandBase.WrapTextCommand;

public class WrapSelectionTextCommand extends WrapTextCommand {
  private final String selection;
  
  public WrapSelectionTextCommand(String opening, String end, String selection) {
    super(opening, end);
    if(selection == null || selection.isBlank()){
      throw new IllegalArgumentException("Selection cannot be null/blank");
    }
    this.selection = selection;
  }
  
  @Override
  public String execute(String text){
    if(text == null || text.isBlank()){
      throw new IllegalArgumentException("Text cannot be null/blank");
    }
    return opening + selection + end;
  }
  public String getSelection(){
    return selection;
  }
}
