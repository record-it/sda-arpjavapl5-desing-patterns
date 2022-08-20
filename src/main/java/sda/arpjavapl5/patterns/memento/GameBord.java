package sda.arpjavapl5.patterns.memento;

import java.util.ArrayList;
import java.util.Arrays;

public class GameBord implements Originator {

    private final String[][] board = new String[3][3];

    @Override
    public void setState(GameState state) {
        copy(state.board, board);
    }

    public void makeMove(String symbol, int col, int row){
        board[col][row] = symbol;
    }

    @Override
    public GameState getState() {
        String[][] copy = new String[3][3];
        copy(board, copy);
        return new GameState(copy);
    }

    private void copy(String[][] source, String[][] target){
        for (int col = 0; col < source.length; col++) {
            for (int row = 0; row < source[col].length; row++) {
                target[col][row] = source[col][row];
            }
        }
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(board[0][0] +" " + board[0][1] +" " + board[0][2] + "\n")
                .append(board[1][0] +" " + board[1][1] +" " + board[1][2] + "\n")
                .append(board[2][0] +" " + board[2][1] +" " + board[2][2] + "\n")
                .toString();
    }
}
