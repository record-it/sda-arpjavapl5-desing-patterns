package sda.arpjavapl5.patterns.exercises;

import java.util.HashMap;

//Zdefiniuj klasę User implementującą ChatListener
//pola: name
public class ChatApp {
    public static void main(String[] args) {
        ChatChannel chatChannel = new ChatChannel("Java");
        //utwórz dwóch userów
        //dołącz obu do chatChannel
        User a = User.builder()
                .name("Adam")
                .channels(new HashMap<>())
                .build();
        User b = User.builder()
                .name("Ewa")
                .channels(new HashMap<>())
                .build();
        ChatChannelStatistic statistic = new ChatChannelStatistic();
        chatChannel.addListener(statistic);
        a.joinChannel(chatChannel);
        b.joinChannel(chatChannel);
        a.sendMessage("Java", "Hello");
        b.sendMessage("Java", "Cześć");
        System.out.println("Liczba wiadomości na kanale: " + statistic.getCounter());
    }
}
