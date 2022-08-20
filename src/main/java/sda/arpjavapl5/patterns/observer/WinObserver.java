package sda.arpjavapl5.patterns.observer;

import java.util.Arrays;

public class WinObserver implements GameObserver{
    private String board[][] = new String[3][3];
    private String winnerSymbol = "";
    @Override
    public void update(String symbol, int col, int row) {
        board[col][row] = symbol;
        if (isWinner()){
            System.out.println("Game over, is winner with symbol " + winnerSymbol);
        }
    }

    private boolean isWinner(){
        for (String[] row : board){
            String symbol = row[0];
            if (symbol == null){
                continue;
            }
            if (symbol.equals(row[1]) && symbol.equals(row[2])){
                winnerSymbol = symbol;
                return true;
            }
        }
        //pozostałe przypadki dla kolumn i przekątnych
        return false;
    }
}
