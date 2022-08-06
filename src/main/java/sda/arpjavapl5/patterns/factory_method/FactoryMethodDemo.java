package sda.arpjavapl5.patterns.factory_method;

import sda.arpjavapl5.patterns.singleton.EagerInputSingleton;
import sda.arpjavapl5.patterns.singleton.EnumInputSingleton;

import java.util.ArrayList;
import java.util.List;

public class FactoryMethodDemo {
    private static final EnumInputSingleton input = EnumInputSingleton.INSTANCE;
    private static MessageCreator messageCreator;
    public static void main(String[] args) {
        List<Message> messages = new ArrayList<>();
        System.out.println("Co chcesz wysłać?");
        System.out.println("1. Email");
        System.out.println("2. SMS");
        int option = input.getScanner().nextInt();
        input.getScanner().nextLine();
        switch (option){
            case 1:
                System.out.println("Wpisz adres docelowy");
                String to = input.getScanner().nextLine();
                messageCreator = new EmailMessageCreator(
                        EmailMessage.builder()
                                .to(to)
                                .build()
                );
                break;
            case 2:
                System.out.println("Wpisz numer telefonu");
                String phone = input.getScanner().nextLine();
                System.out.println("Wpisz treść");
                String content = input.getScanner().nextLine();
                messageCreator = new SMSMessageCreator(
                        content,
                        phone
                );
                break;
        }
        if (messageCreator != null) {
            messages.add(messageCreator.create());
            System.out.println(messages);
        }

    }
}
