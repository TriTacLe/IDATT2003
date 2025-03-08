package no.ntnu.trondheim.a5cardgame;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
  public static void main(String[] args) {
    launch();
  }

  @Override
  public void start(Stage stage) throws IOException {
    stage.setTitle("Hello!");
    stage.setScene(scene);
    stage.show();
  }
}