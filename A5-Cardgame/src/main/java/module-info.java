module edu.ntnu.idatt2003.a5cardgame {
  requires javafx.controls;
  requires javafx.fxml;

  opens edu.ntnu.idatt2003.a5cardgame to javafx.fxml;
  exports edu.ntnu.idatt2003.a5cardgame;
}