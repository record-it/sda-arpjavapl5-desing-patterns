package sda.arpjavapl5.patterns.memento;
//hermatyzacja na poziomie pakietu
//Klienci korzystajÄ… z klasy GameState poza pakietem
public class GameState {
    final String[][] board;

    public GameState(String[][] board) {
        this.board = board;
    }
}
