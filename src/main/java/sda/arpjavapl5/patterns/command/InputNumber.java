package sda.arpjavapl5.patterns.command;

import java.util.Scanner;

public class InputNumber implements Command{

    double value;

    boolean inputed;
    final Scanner scanner;

    public InputNumber(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void execute() {
        System.out.println("Wpisz liczbę:");
        value = scanner.nextDouble();
        inputed = true;
    }

    @Override
    public void undo() {
        inputed = false;
    }

    public boolean isInputed(){
        return inputed;
    }

    public double value(){
        return value;
    }
}
