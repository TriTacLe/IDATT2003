module no.ntnu.trondheim.cardgame {
    requires javafx.controls;
    requires javafx.fxml;


    opens no.ntnu.trondheim.cardgame to javafx.fxml;
    exports no.ntnu.trondheim.cardgame;
}