package A3.group.commands.CapitalizeTextCommand;

import A3.group.commands.TextCommandBase.CapitalizedTextCommand;

public class CapitalizeWordsTextCommand extends CapitalizedTextCommand {
  final String selection;

  public CapitalizeWordsTextCommand(String selection){
    this.selection = selection;
  }  

  /**
   * w3 schools
   */
  @Override
  public String execute(String text){
    String regex = "[,\\.\\s]";
    String [] words = text.split(regex);
    StringBuilder capitalizedText = new StringBuilder();

    for (String word : words){      
        capitalizedText.append(Character.toUpperCase(word.charAt(0)))
        .append(word.substring(1))
        .append(" ");
    }

    return capitalizedText.toString().trim();
  }

  public String getSelection() {
    return selection;
  }
  
  
}
