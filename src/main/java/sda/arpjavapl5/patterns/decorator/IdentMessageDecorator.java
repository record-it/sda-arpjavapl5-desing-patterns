package sda.arpjavapl5.patterns.decorator;

public class IdentMessageDecorator extends Message{
    final Message message;

    public IdentMessageDecorator(Message message) {
        super(null);
        this.message = message;
    }

    protected IdentMessageDecorator(String content, Message message) {
        super(content);
        this.message = message;
    }

    @Override
    public String format() {
        StringBuilder sb = new StringBuilder();
        final String[] strings = message.format().split(System.lineSeparator());
        for(String line: strings){
            sb.append("    ").append(line).append(System.lineSeparator());
        }
        return sb.toString();
    }
}
