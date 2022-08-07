package sda.arpjavapl5.patterns.chain;

public class PasteHandler implements StringCommandHandler{
    static final String COPY = "PASTE";
    final StringCommandHandler next;

    public PasteHandler(StringCommandHandler next) {
        this.next = next;
    }

    @Override
    public String handle(String command) {
        if (command.toUpperCase().equals(COPY)){
            return "PASTE command accepted";
        }
        if (next != null) {
            return next.handle(command);
        } else {
            return "Unknown command!";
        }
    }
}
