package A3.group.commands.CapitalizeTextCommand;

import A3.group.commands.TextCommandBase.CapitalizedTextCommand;

public class CapitalizeSelectionTextCommand extends CapitalizedTextCommand {
  private final String selection;
  
  public CapitalizeSelectionTextCommand(String selection) {
    if(selection==null||selection.isBlank()){
      throw new IllegalArgumentException("Selection cannot be null/blank");
    }
    this.selection = selection;
  }
  
  @Override
  public String execute(String text){
    if (selection == null || selection.isEmpty()) {
      throw new IllegalArgumentException("Text cannot be empty");
    }
    char character = Character.toUpperCase(this.selection.charAt(0));
    String newSelection = character + selection.substring(1);


    return  text.replace(selection, newSelection);
  }
  
  public String getSelection(){
    return selection;
  }
}
