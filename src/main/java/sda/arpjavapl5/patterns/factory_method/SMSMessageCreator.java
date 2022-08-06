package sda.arpjavapl5.patterns.factory_method;

public class SMSMessageCreator implements MessageCreator{

    final String content;
    final String phoneNumber;

    public SMSMessageCreator(String content, String phoneNumber) {
        this.content = content;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public Message create() {
        return SMSMessage
                .messageBuilder()
                .content(content)
                .phoneNumber(phoneNumber)
                .build();
    }
}
