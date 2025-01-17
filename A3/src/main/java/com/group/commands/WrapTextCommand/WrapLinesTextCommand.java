package com.group.commands.WrapTextCommand;

import com.group.commands.TextCommandBase.WrapTextCommand;

public class WrapLinesTextCommand extends WrapTextCommand {
  public WrapLinesTextCommand(String opening, String end) {
    super(opening, end);
  }
  
  public String execute(String text){
    return opening + text + end;
  }
}
