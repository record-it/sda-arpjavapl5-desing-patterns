package sda.arpjavapl5.patterns.decorator;

public class MessageDecoratorDemo {
    public static void main(String[] args) {
        Message message = new TextMessage("Hello decorators");
        message = new IdentMessageDecorator(message);
        message = new FrameMessageDecorator(message);
        System.out.println(message.format());
    }
}
