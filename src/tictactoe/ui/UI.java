package tictactoe.ui;


import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import tictactoe.gamelogic.GameLogic;

import java.util.ArrayList;
import java.util.List;

public class UI {
    private static GridPane gridPane = new GridPane();
    private static int[][] actualGameBoard = new int[4][4];
    private int moves = 0;
    private static boolean xTurn;
    private static GameLogic gameLogic = new GameLogic();
    private static boolean gameOver;
    private static Label label = new Label();
    private static Button newGameButton = new Button("New Game");
    private static List<Button> buttons = new ArrayList<>();

    public Button createButton() {
        newGame(newGameButton);
        newGameButton.setTranslateX(215);
        return newGameButton;
    }

    private void newGame(Button button) {
        button.setOnMouseClicked(e -> {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    actualGameBoard[i][j] = 0;
                }
            }
            for (int i = 0; i < buttons.size(); i++) {
                buttons.get(i).setText("");
            }
            label.setText("");
            moves = 0;
            gameOver = false;
        });

    }
    private void addPain(int rowIndex,int colIndex) {
        Button button = new Button();
        button.setMinWidth(100);
        button.setMinHeight(100);
        button.setOnMouseClicked(e -> {

            if(gameOver) {
                for (int i=0; i<4; i++) {
                    for (int j=0; j<4; j++) {
                        actualGameBoard[i][j] = 1;
                    }
                }
            }

            turn();
            if (xTurn) {
                if (actualGameBoard[rowIndex][colIndex] == 0) {
                    actualGameBoard[rowIndex][colIndex] = 1;
                    button.setText("X");
                    moves++;
                    gameOver = gameLogic.checkGameWon(actualGameBoard);
                    if (gameOver) {
                        label.setText("X wins it all!");
                    }
                }

                if (moves == 16) {
                    label.setText("Draw!");
                }
            }

            else {
                if (actualGameBoard[rowIndex][colIndex] == 0) {
                    actualGameBoard[rowIndex][colIndex] = 2;
                    button.setText("O");
                    moves++;
                    gameOver = gameLogic.checkGameWon(actualGameBoard);
                    if (gameOver) {
                        label.setText("O wins it all!");
                    }
                }

                if (moves == 16) {
                    label.setText("Draw!");
                }
            }
        });
        gridPane.add(button, colIndex,rowIndex);
        buttons.add(button);
    }

    private void turn() {
        if (moves % 2 == 0) {
            //x's turn
            xTurn = true;
        }
        else {
            //o's turn
            xTurn = false;
        }
    }

    private void initializeGameBoard() {
        for (int i=0; i<4; i++) {
            for (int j=0; j<4; j++) {
                actualGameBoard[i][j] = 0;
            }
        }
    }

    public Label createLabel() {
        label.setMaxWidth(Double.MAX_VALUE);
        AnchorPane.setLeftAnchor(label, 0.0);
        AnchorPane.setRightAnchor(label, 0.0);
        label.setAlignment(Pos.CENTER);
        return label;
    }

    public GridPane createGridPane() {
        initializeGameBoard();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                addPain(j, i);
            }
        }
        gridPane.setVgap(10);
        gridPane.setHgap(33.33);

        return gridPane;
    }
}