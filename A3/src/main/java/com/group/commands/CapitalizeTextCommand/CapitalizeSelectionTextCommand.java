package com.group.commands.CapitalizeTextCommand;

import com.group.commands.TextCommandBase.CapitalizedTextCommand;

public class CapitalizeSelectionTextCommand extends CapitalizedTextCommand {
  private final String selection;
  
  public CapitalizeSelectionTextCommand(String selection) {
    this.selection = selection;
  }
  
  public String execute(String text){
    return text;//Placeholder
  }
  
  public String getSelection(){
    return selection;
  }
}
