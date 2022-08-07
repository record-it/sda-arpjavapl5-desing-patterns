package sda.arpjavapl5.patterns.decorator;

public abstract class Message {
    final String content;

    protected Message(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public abstract String format();
}
