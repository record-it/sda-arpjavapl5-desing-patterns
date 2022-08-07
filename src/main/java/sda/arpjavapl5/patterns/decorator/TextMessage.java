package sda.arpjavapl5.patterns.decorator;

public class TextMessage extends Message{

    protected TextMessage(String content) {
        super(content);
    }

    @Override
    public String format() {
        return getContent();
    }
}
