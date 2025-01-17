package com.group.commands.WrapTextCommand;

import com.group.commands.TextCommandBase.WrapTextCommand;

public class WrapSelectionTextCommand extends WrapTextCommand {
  private String selection;
  
  public WrapSelectionTextCommand(String opening, String end, String selection) {
    super(opening, end);
    this.selection = selection;
  }
  
  public String execute(String text){
    return opening + selection + end;
  }
  public String getSelection(){
    return selection;
  }
}
