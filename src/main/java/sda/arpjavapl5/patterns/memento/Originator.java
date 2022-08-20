package sda.arpjavapl5.patterns.memento;

public interface Originator {
    void setState(GameState state);
    GameState getState();
}
