package sda.arpjavapl5.patterns.factory_method;

public class EmailMessageCreator implements MessageCreator{

    final EmailMessage message;

    public EmailMessageCreator(EmailMessage message) {
        this.message = message;
    }

    @Override
    public Message create() {
        return message;
    }
}
