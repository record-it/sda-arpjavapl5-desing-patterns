package sda.arpjavapl5.patterns.builder;

import java.util.List;

public class EmailMessageDemo {
    public static void main(String[] args) {
        final EmailMessage message = EmailMessage.builder()
                .to(List.of("adam@sda.pl", "karol@sda.pl"))
                .addCC("dyrektor@sda.pl")
                .addCC("prezes@sda.pl")
                .content("Test")
                .subject("Powiadomienie o terminie platności")
                .build();
        System.out.println(message);
    }
}
