package sda.arpjavapl5.patterns.chain;

public class StartHandler implements StringCommandHandler{

    public static final String START = "START";
    final StringCommandHandler next;

    public StartHandler(StringCommandHandler next) {
        this.next = next;
    }

    @Override
    public String handle(String command) {
        if (command.toUpperCase().equals(START)){
            return "Commad START accepted";
        }
        if (next != null) {
            return next.handle(command);
        } else {
            return "Unknown command!";
        }
    }
}
