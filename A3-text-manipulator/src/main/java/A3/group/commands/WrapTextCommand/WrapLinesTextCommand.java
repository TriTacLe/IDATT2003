package A3.group.commands.WrapTextCommand;

import A3.group.commands.TextCommandBase.WrapTextCommand;

/**
 * The type Wrap lines text command.
 */
public class WrapLinesTextCommand extends WrapTextCommand {
  /**
   * Instantiates a new Wrap lines text command.
   *
   * @param opening the opening
   * @param end     the end
   */
  public WrapLinesTextCommand(String opening, String end) {
    super(opening, end);
    if (opening == null || opening.isBlank()) {
      throw new IllegalArgumentException("Opening cannot be null/blank");
    }
    if (end == null || end.isBlank()) {
      throw new IllegalArgumentException("End cannot be null/blank");
    }
  }
  
  @Override
  public String execute(String text) {
    if (text == null || text.isBlank()) {
      throw new IllegalArgumentException("Text cannot be null/blank");
    }
    return opening + text + end;
  }
}
