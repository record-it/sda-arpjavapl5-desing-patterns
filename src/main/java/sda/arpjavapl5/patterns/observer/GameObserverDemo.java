package sda.arpjavapl5.patterns.observer;

public class GameObserverDemo {
    public static void main(String[] args) {
        GameBoardObservable game = new GameBoardObservable();
        game.registerObserver((s, c, r) -> {
            System.out.println(String.format("gracz: %s, kolumna: %d, wiersz: %d",s, c, r ));
        });
        WinObserver winObserver = new WinObserver();
        game.registerObserver(winObserver);

        //symulujemy ruchy graczy
        game.makeMove("O", 1, 1);
        game.makeMove("X", 0, 1);
        game.makeMove("O", 1, 2);
        game.makeMove("O", 1, 0);
        game.unregisterObserver(winObserver);
        game.makeMove("O", 1, 0);
        game.makeMove("O", 2, 0);

    }
}
