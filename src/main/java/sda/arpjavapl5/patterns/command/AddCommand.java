package sda.arpjavapl5.patterns.command;

import java.util.function.Supplier;

public class AddCommand implements Command{

    double result;

    final Supplier<Double> a;
    final Supplier<Double> b;

    public AddCommand(Supplier<Double> a, Supplier<Double> b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void execute() {
        result = a.get() + b.get();
    }

    @Override
    public void undo() {
        result = 0;
    }

    public double result(){
        return result;
    }

}
