package sda.arpjavapl5.patterns.decorator;

public class FrameMessageDecorator extends Message{
    final Message message;

    public FrameMessageDecorator(Message message) {
        super(null);
        this.message = message;
    }

    protected FrameMessageDecorator(String content, Message message) {
        super(content);
        this.message = message;
    }

    @Override
    public String format() {
        StringBuilder sb = new StringBuilder();
        sb.append("***********************").append(System.lineSeparator());
        sb.append(message.format()).append(System.lineSeparator());
        sb.append("************************").append(System.lineSeparator());
        return sb.toString();
    }
}
