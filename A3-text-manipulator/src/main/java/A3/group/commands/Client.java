package A3.group.commands;

import A3.group.commands.CapitalizeTextCommand.CapitalizeWordsTextCommand;
import A3.group.commands.ReplaceTextCommand.ReplaceFirstTextCommand;
import A3.group.commands.TextCommandBase.CapitalizedTextCommand;
import A3.group.commands.TextCommandBase.ReplaceTextCommand;
import A3.group.commands.TextCommandBase.WrapTextCommand;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Main class
 */
public class Client {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    List<TextCommand> commands = new ArrayList<>(); //Deque<TextCommand>
    
    System.out.println("Text manipulating API");
    System.out.println("Write text:");
    String inputText = scanner.nextLine();
    
    while (true) {
      System.out.println("\nChose commando:");
      System.out.println("1. ReplaceTextCommand");
      System.out.println("2. ReplaceFirstTextCommand");
      System.out.println("3. WrapTextCommand");
      System.out.println("4. CapitalizeTextCommand");
      System.out.println("5. CapitalizeWordsTextCommand");
      System.out.println("6. Script");
      System.out.println("7. Exit");
      
      int choice;
      try {
        choice = scanner.nextInt();
        scanner.nextLine();
      } catch (InputMismatchException e) {
        System.out.println("Try again.");
        scanner.nextLine();
        continue;
      }
      switch (choice) {
        case 1 -> {
          System.out.println("Write target text:");
          String target = scanner.nextLine();
          System.out.println("Write replacement text:");
          String replacement = scanner.nextLine();
          commands.add(new ReplaceTextCommand(target, replacement));
        }
        case 2 -> {
          System.out.println("Write target text:");
          String target = scanner.nextLine();
          System.out.println("Write replacement text:");
          String replacement = scanner.nextLine();
          commands.add(new ReplaceFirstTextCommand(target, replacement));
        }
        case 3 -> {
          System.out.println("Write opening text:");
          String opening = scanner.nextLine();
          System.out.println("Write end text:");
          String end = scanner.nextLine();
          commands.add(new WrapTextCommand(opening, end));
        }
        case 4 -> commands.add(new CapitalizedTextCommand());
        case 5 -> {
          System.out.println("Write word:");
          String word = scanner.nextLine();
          commands.add(new CapitalizeWordsTextCommand(word));
        }
        case 6 -> {
          Script script = new Script(commands);
          String result = script.execute(inputText);
          System.out.println("Result:");
          System.out.println(result);
        }
        case 7 -> {
          System.out.println("The end of the script");
          scanner.close();
          return;
        }
        default -> System.out.println("Try again!!");
      }
    }
  }
}
