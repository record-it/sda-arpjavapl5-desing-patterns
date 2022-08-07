package sda.arpjavapl5.patterns.command;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommandDemo {
    static Scanner scanner= new Scanner(System.in);

    public static void main(String[] args) {
        List<Command> macro = new ArrayList<>();
        InputNumber inputA = new InputNumber(scanner);
        macro.add(inputA);
        InputNumber inputB = new InputNumber(scanner);
        macro.add(inputB);
        AddCommand add = new AddCommand(inputA::value,inputB::value);
        macro.add(add);
        PrintNumberCommand print = new PrintNumberCommand(add::result);
        macro.add(print);

        macro.forEach(Command::execute);

    }
}
