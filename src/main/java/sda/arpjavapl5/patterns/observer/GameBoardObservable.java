package sda.arpjavapl5.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class GameBoardObservable {
    private List<GameObserver> observers = new ArrayList();
    private String[][] board = new String[3][3];

    public void registerObserver(GameObserver observer){
        observers.add(observer);
    }

    public void unregisterObserver(GameObserver observer){
        observers.remove(observer);
    }

    public void makeMove(String symbol, int col, int row){
        if (check(col, row)){
            board[col][row] = symbol;
            //informacja do obserwatorów
            notifyAllObservers(symbol, col, row);
        }
    }

    public void notifyAllObservers(String symbol, int col, int row){
        observers.forEach(o -> o.update(symbol, col, row));
    }

    private boolean check(int col, int row){
        return col > - 1 && col < 3 && row > -1 && row < 3;
    }
}
