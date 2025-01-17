package com.group.commands.ReplaceTextCommand;

import com.group.commands.TextCommandBase.ReplaceTextCommand;

public class ReplaceFirstTextCommand extends ReplaceTextCommand {

  public ReplaceFirstTextCommand(String target, String replacement) {
    super(target, replacement);
  }
  
  public String execute(String text){
    return text.replaceFirst(target, replacement);
  }
}
