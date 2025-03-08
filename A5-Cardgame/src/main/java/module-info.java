module no.ntnu.trondheim.a5cardgame {
    requires javafx.controls;
    requires javafx.fxml;


    opens no.ntnu.trondheim.a5cardgame to javafx.fxml;
    exports no.ntnu.trondheim.a5cardgame;
}