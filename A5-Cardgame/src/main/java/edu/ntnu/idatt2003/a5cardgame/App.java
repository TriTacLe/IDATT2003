package edu.ntnu.idatt2003.a5cardgame;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import java.util.List;

public class App extends Application {
  private DeckOfCards deck;
  private List<Card> currentHand;
  private Label handLabel, flushLabel, queenLabel, heartsLabel, sumLabel;
  private TextField cardCountField;
  private HBox cardDisplay;

  @Override
  public void start(Stage primaryStage) {
    deck = new DeckOfCards();

    Button dealButton = new Button("Deal hand");
    Button checkButton = new Button("Check hand");

    dealButton.setOnAction(e -> dealHand());
    checkButton.setOnAction(e -> checkHand());

    cardCountField = new TextField("5");
    cardCountField.setMaxWidth(50);
    cardCountField.setStyle("-fx-font-weight: bold; -fx-font-size: 20px; -fx-background-color: #FFC0CB; -fx-border-color: #ffffff");

    handLabel = new Label("Hand: ");
    flushLabel = new Label("Flush: ");
    queenLabel = new Label("Queen of Spades: ");
    heartsLabel = new Label("Hearts: ");
    sumLabel = new Label("Sum of Faces: ");

    handLabel.setStyle("-fx-font-weight: bold; -fx-font-size: 20px; -fx-background-color: #FFC0CB; -fx-border-color: #ffffff");
    flushLabel.setStyle("-fx-font-weight: bold; -fx-font-size: 20px; -fx-background-color: #FFC0CB; -fx-border-color: #ffffff");
    queenLabel.setStyle("-fx-font-weight: bold; -fx-font-size: 20px; -fx-background-color: #FFC0CB; -fx-border-color: #ffffff");
    heartsLabel.setStyle("-fx-font-weight: bold; -fx-font-size: 20px; -fx-background-color: #FFC0CB; -fx-border-color: #ffffff");
    sumLabel.setStyle("-fx-font-weight: bold; -fx-font-size: 20px; -fx-background-color: #FFC0CB; -fx-border-color: #ffffff");

    cardDisplay = new HBox(15);
    cardDisplay.setAlignment(Pos.CENTER);
    cardDisplay.setPrefWidth(600);
    ScrollPane scrollPane = new ScrollPane(cardDisplay);
    scrollPane.setFitToHeight(true);
    scrollPane.setPrefHeight(150);
    scrollPane.setStyle("-fx-background: transparent;");

    HBox buttonBox = new HBox(10, dealButton, checkButton);
    buttonBox.setAlignment(Pos.CENTER);
    HBox inputBox = new HBox(10, new Label("How many cards to deal:"), cardCountField);
    inputBox.setStyle("-fx-font-weight: bold; -fx-font-size: 20px; -fx-background-color: #FFC0CB; -fx-border-color: #ffffff");
    inputBox.setAlignment(Pos.CENTER);
    VBox resultsBox = new VBox(10, flushLabel, queenLabel, heartsLabel, sumLabel);
    resultsBox.setAlignment(Pos.CENTER);

    VBox layout = new VBox(15, buttonBox, scrollPane, inputBox, resultsBox);
    layout.setAlignment(Pos.CENTER);
    layout.setStyle("-fx-background-color: darkred; -fx-padding: 20;");

    Scene scene = new Scene(layout, 700, 500);
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
    if (currentHand == null) return;
    HandOfCards hand = new HandOfCards(currentHand);
    flushLabel.setText("Flush: " + (hand.isFlush() ? "Yes" : "No"));
    queenLabel.setText("Queen of Spades: " + (hand.containsQueenOfSpades() ? "Yes" : "No"));
    heartsLabel.setText("Hearts: " + hand.heartsInHand());
    sumLabel.setText("Sum of Faces: " + hand.sumValues());
  }

  private void updateCardDisplay() {
    cardDisplay.getChildren().clear();
    for (Card card : currentHand) {
      Canvas canvas = new Canvas(90, 130);
      drawCard(canvas.getGraphicsContext2D(), card);
      cardDisplay.getChildren().add(canvas);
    }
  }

  private void drawCard(GraphicsContext gc, Card card) {
    gc.setFill(Color.LIGHTGRAY);
    gc.fillRoundRect(3, 3, 90, 130, 15, 15);
    gc.setFill(Color.WHITE);
    gc.fillRoundRect(0, 0, 90, 130, 15, 15);
    gc.setStroke(Color.BLACK);
    gc.setLineWidth(2);
    gc.strokeRoundRect(0, 0, 90, 130, 15, 15);

    String suitSymbol = switch (card.getSuit()) {
      case 'H' -> "♥";
      case 'D' -> "♦";
      case 'S' -> "♠";
      case 'C' -> "♣";
      default -> "?";
    };


    Color textColor = (card.getSuit() == 'H' || card.getSuit() == 'D') ? Color.RED : Color.BLACK;
    gc.setFill(textColor);
    gc.setFont(Font.font("Arial", FontWeight.BOLD, 20));

    gc.fillText(suitSymbol + " " + card.getValue(), 10, 25);
    gc.fillText(suitSymbol + " " + card.getValue(), 60, 120);
  }

  public static void main(String[] args) {
    launch(args);
  }
}