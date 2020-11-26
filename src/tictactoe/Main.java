package tictactoe;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import tictactoe.ui.UI;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        UI ui = new UI();
        GridPane gridPane = ui.createGridPane();
        Label label = ui.createLabel();
        Button button = ui.createButton();

        VBox vBox = new VBox(gridPane, label,button);
        primaryStage.setScene(new Scene(vBox, 500, 500));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
