package edu.ntnu.idatt2003.a5cardgame;

import java.util.List;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/**
 * The GUI
 */
public class App extends Application {
  private Label handLabel, flushLabel, queenLabel, heartsLabel, sumLabel;
  private DeckOfCards deck;
  private List<Card> currentHand;
  private HBox cardDisplay;
  private TextField cardCountField;

  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
    deck = new DeckOfCards();

    //Buttons
    Button dealBtn = new Button("Deal Hand");
    Button checkBtn = new Button("Check Hand");

    dealBtn.setOnAction(e -> dealHand());
    checkBtn.setOnAction(e -> checkHand());

    //input
    cardCountField = new TextField("5");
    cardCountField.setMaxWidth(50);

    //Labels
    handLabel = new Label("Hand: ");
    flushLabel = new Label("Flush: ");
    queenLabel = new Label("Queen of Spades: ");
    heartsLabel = new Label("Hearts: ");
    sumLabel = new Label("Sum: ");

    //Display of cards
    cardDisplay = new HBox(10);
    cardDisplay.setAlignment(Pos.CENTER);

    //boxes
    HBox btnBox = new HBox(10, dealBtn, checkBtn);
    btnBox.setAlignment(Pos.CENTER);
    HBox inputBox = new HBox(10, new Label("Amount card to deal: ") ,cardCountField);
    inputBox.setAlignment(Pos.CENTER);
    VBox resultBox = new VBox(10, handLabel, flushLabel, queenLabel, heartsLabel, sumLabel);
    resultBox.setAlignment(Pos.CENTER);

    //Layout
    VBox layout = new VBox(15, btnBox, cardDisplay, inputBox, resultBox);
    layout.setAlignment(Pos.CENTER);
    layout.setStyle("-fx-background-color: darkred; -fx-padding: 20;");

    Scene scene = new Scene(layout, 500, 400);
    primaryStage.setScene(scene);
    primaryStage.setTitle("Card Game");
    primaryStage.show();
  }

  private void dealHand() {
    int count = Integer.parseInt(cardCountField.getText());
    currentHand = deck.dealHand(count);
    handLabel.setText("Hand: " + new HandOfCards(currentHand).toString());
    updateCardDisplay();
  }
  private void checkHand() {
    if (currentHand == null) {
      return;
    }
    HandOfCards hand = new HandOfCards(currentHand);
    flushLabel.setText("Flush: " + (hand.isFlush() ? "Yes": "No"));
    queenLabel.setText("Queen of Spades: " + (hand.containsQueenOfSpades() ? "Yes": "No"));
    heartsLabel.setText("Hearts: " + hand.heartsInHand());
    sumLabel.setText("Sum: " + hand.sumValues());
  }

  private void updateCardDisplay() {
    cardDisplay.getChildren().clear();
    for (Card card : currentHand) {
      ImageView cardImage = new ImageView(new Image(getClass().getResourceAsStream("/cards/" + card.toString() + ".png")));
      cardImage.setFitWidth(70);
      cardImage.setPreserveRatio(true);
      cardDisplay.getChildren().add(cardImage);
    }

  }
}
