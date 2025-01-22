package A3.group.commands.CapitalizeTextCommand;

import A3.group.commands.TextCommandBase.CapitalizedTextCommand;

public class CapitalizeWordsTextCommand extends CapitalizedTextCommand {
  final String selection;

  public CapitalizeWordsTextCommand(String selection){
    if(selection == null || selection.isBlank()){
      throw new IllegalArgumentException("selection cannot be null or empty");
    }
    this.selection = selection;
  }  

  /**
   * w3 schools
   */
  @Override
  public String execute(String text){
    if(text == null || text.isBlank()){{
      throw new IllegalArgumentException("Input text cannot be null or empty");
    }}
    
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

