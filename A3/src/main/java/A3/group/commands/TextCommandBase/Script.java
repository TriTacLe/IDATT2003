package A3.group.commands.TextCommandBase;
import java.util.ArrayList;
import java.util.List;

import A3.group.commands.TextCommand;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Script {
  private final List<TextCommand> textCommands;
  

  public Script(){
    textCommands = new ArrayList<>();
  }

  public String execute(String text){
    for (TextCommand command : textCommands) {
      text = command.execute(text);
    }
    return text;
  }
}