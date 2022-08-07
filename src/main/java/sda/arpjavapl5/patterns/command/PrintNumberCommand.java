package sda.arpjavapl5.patterns.command;

import java.util.function.Supplier;

public class PrintNumberCommand implements Command{

    final Supplier<Double> value;

    public PrintNumberCommand(Supplier<Double> value) {
        this.value = value;
    }

    @Override
    public void execute() {
        System.out.println(value.get());
    }

    @Override
    public void undo() {
    }
}
