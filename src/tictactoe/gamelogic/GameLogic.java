package tictactoe.gamelogic;

public class GameLogic {
    //private static final int[][] actualGameBoard = new int[4][4];

    public boolean checkGameWon(int[][] actualGameBoard) {
        //for X
        //horizontal

        if (actualGameBoard[0][0] == 1
        && actualGameBoard[0][1] == 1
        && actualGameBoard[0][2] == 1
        && actualGameBoard[0][3] == 1) {
            return true;
        }
        else if (actualGameBoard[1][0] == 1
                && actualGameBoard[1][1] == 1
                && actualGameBoard[1][2] == 1
                && actualGameBoard[1][3] == 1) {
            return true;
        }
        else if (actualGameBoard[2][0] == 1
                && actualGameBoard[2][1] == 1
                && actualGameBoard[2][2] == 1
                && actualGameBoard[2][3] == 1) {
            return true;
        }
        else if (actualGameBoard[3][0] == 1
                && actualGameBoard[3][1] == 1
                && actualGameBoard[3][2] == 1
                && actualGameBoard[3][3] == 1) {
            return true;
        }
        //vertical
        else if (actualGameBoard[0][0] == 1
                && actualGameBoard[1][0] == 1
                && actualGameBoard[2][0] == 1
                && actualGameBoard[3][0] == 1) {
            return true;
        }
        else if (actualGameBoard[0][1] == 1
                && actualGameBoard[1][1] == 1
                && actualGameBoard[2][1] == 1
                && actualGameBoard[3][1] == 1) {
            return true;
        }
        else if (actualGameBoard[0][2] == 1
                && actualGameBoard[1][2] == 1
                && actualGameBoard[2][2] == 1
                && actualGameBoard[3][2] == 1) {
            return true;
        }
        else if (actualGameBoard[0][3] == 1
                && actualGameBoard[1][3] == 1
                && actualGameBoard[2][3] == 1
                && actualGameBoard[3][3] == 1) {
            return true;
        }
        //diagonal
        else if (actualGameBoard[0][0] == 1
                && actualGameBoard[1][1] == 1
                && actualGameBoard[2][2] == 1
                && actualGameBoard[3][3] == 1) {
            return true;
        }
        else if (actualGameBoard[0][3] == 1
                && actualGameBoard[1][2] == 1
                && actualGameBoard[2][1] == 1
                && actualGameBoard[3][0] == 1) {
            return true;
        }
        //for O
        //horizontal
        else if (actualGameBoard[0][0] == 2
                && actualGameBoard[0][1] == 2
                && actualGameBoard[0][2] == 2
                && actualGameBoard[0][3] == 2) {
            return true;
        }
        else if (actualGameBoard[1][0] == 2
                && actualGameBoard[1][1] == 2
                && actualGameBoard[1][2] == 2
                && actualGameBoard[1][3] == 2) {
            return true;
        }
        else if (actualGameBoard[2][0] == 2
                && actualGameBoard[2][1] == 2
                && actualGameBoard[2][2] == 2
                && actualGameBoard[2][3] == 2) {
            return true;
        }
        else if (actualGameBoard[3][0] == 2
                && actualGameBoard[3][1] == 2
                && actualGameBoard[3][2] == 2
                && actualGameBoard[3][3] == 2) {
            return true;
        }
        //vertical
        else if (actualGameBoard[0][0] == 2
                && actualGameBoard[1][0] == 2
                && actualGameBoard[2][0] == 2
                && actualGameBoard[3][0] == 2) {
            return true;
        }
        else if (actualGameBoard[0][1] == 2
                && actualGameBoard[1][1] == 2
                && actualGameBoard[2][1] == 2
                && actualGameBoard[3][1] == 2) {
            return true;
        }
        else if (actualGameBoard[0][2] == 2
                && actualGameBoard[1][2] == 2
                && actualGameBoard[2][2] == 2
                && actualGameBoard[3][2] == 2) {
            return true;
        }
        else if (actualGameBoard[0][3] == 2
                && actualGameBoard[1][3] == 2
                && actualGameBoard[2][3] == 2
                && actualGameBoard[3][3] == 2) {
            return true;
        }
        //diagonal
        else if (actualGameBoard[0][0] == 2
                && actualGameBoard[1][1] == 2
                && actualGameBoard[2][2] == 2
                && actualGameBoard[3][3] == 2) {
            return true;
        }
        else if (actualGameBoard[0][3] == 2
                && actualGameBoard[1][2] == 2
                && actualGameBoard[2][1] == 2
                && actualGameBoard[3][0] == 2) {
            return true;
        }
        else {
            return false;
        }
    }

}
