package A3.group.commands.TextCommandBase;

import A3.group.commands.TextCommand;

public class ReplaceTextCommand implements TextCommand {
  protected String target;
  protected String replacement;
  
  public ReplaceTextCommand(String target, String replacement) {
    if (target == null || target.isBlank()) {
      throw new IllegalArgumentException("Target cannot be null or empty");
    }
    if (replacement == null || replacement.isBlank()) {
      throw new IllegalArgumentException("Replacement cannot be null or empty");
    }
    
    this.target = target;
    this.replacement = replacement;
  }
  
  @Override
  public String execute(String text) {
    if (text == null || text.isBlank()) {
      throw new IllegalArgumentException("Input text cannot be null or empty");
    }
    return text.replace(target, replacement);
  }
  
  public String getTarget() {
    return target;
  }
  
  public String getReplacement() {
    return replacement;
  }
}
