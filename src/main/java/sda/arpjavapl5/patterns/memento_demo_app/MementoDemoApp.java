package sda.arpjavapl5.patterns.memento_demo_app;

import sda.arpjavapl5.patterns.memento.GameBord;

public class MementoDemoApp {
    public static void main(String[] args) {
        GameBord game = new GameBord();
        game.makeMove("O", 1, 2);
        game.makeMove("X", 2, 2);
        GameBoardStateSaver saver = new GameBoardStateSaver(game);
        saver.save("1");
        game.makeMove("O", 2, 0);
        System.out.println("*****PRZED********");
        System.out.println(game);
        saver.load("1");
        System.out.println("*****PO********");
        System.out.println(game);
    }
}
