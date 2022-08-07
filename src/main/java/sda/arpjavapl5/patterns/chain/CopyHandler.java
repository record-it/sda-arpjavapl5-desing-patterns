package sda.arpjavapl5.patterns.chain;

public class CopyHandler implements StringCommandHandler{
    static final String COPY = "COPY";
    final StringCommandHandler next;

    public CopyHandler(StringCommandHandler next) {
        this.next = next;
    }

    @Override
    public String handle(String command) {
        if (command.toUpperCase().equals(COPY)){
            return "COPY command accepted";
        }
        if (next != null) {
            return next.handle(command);
        } else {
            return "Unknown command!";
        }
    }
}
