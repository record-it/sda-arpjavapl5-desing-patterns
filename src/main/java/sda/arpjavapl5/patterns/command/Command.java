package sda.arpjavapl5.patterns.command;

public interface Command {
    void execute();
    void undo();
}
