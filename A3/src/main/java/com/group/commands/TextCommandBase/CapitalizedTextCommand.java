package com.group.commands.TextCommandBase;

import com.group.commands.TextCommand;

public class CapitalizedTextCommand implements TextCommand {
  public String execute(String text){
    return text.toUpperCase();
  }
}
