package sda.arpjavapl5.patterns.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorDemo {
    public static void main(String[] args) {
        List<ChatUser> users = new ArrayList();
        users.add(ChatUser.builder()
                        .name("Adam")
                        .active(true)
                        .messages(new ArrayList<>())
                .build());
        users.add(ChatUser.builder()
                .name("Ewa")
                .active(true)
                .messages(new ArrayList<>())
                .build());
        users.add(ChatUser.builder()
                .name("Karol")
                .messages(new ArrayList<>())
                .active(false)
                .build());
        ChannelMediator channel = new ChannelMediatorList(
                users
        );

        //użytkownik wysyła wiadomość do wszystkich
        channel.broadcast("Hello");
        //użytkownik wysyła wiadomość do Ewy
        channel.privateMessage(users.get(1), "Cześć Ewa");
        System.out.println("************** Adam ************");
        System.out.println(users.get(0).getMessages());
        System.out.println("************** Ewa *************");
        System.out.println(users.get(1).getMessages());
        System.out.println("************** Karol ***********");
        System.out.println(users.get(2).getMessages());
    }
}
