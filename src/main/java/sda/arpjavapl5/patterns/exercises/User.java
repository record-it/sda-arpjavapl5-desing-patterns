package sda.arpjavapl5.patterns.exercises;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Builder
@Data
public class User implements ChatListener{
    private String name;
    private Map<String, ChatChannel> channels = new HashMap<>();
    @Override
    public void update(ChatEvent event) {
        System.out.println("Wiadomość z kanału: " + event.getChannel().getName());
        System.out.println("Od: " + event.getFrom());
        System.out.println("Treść: " + event.getMessage());
    }

    public void joinChannel(ChatChannel channel){
        channels.put(channel.getName(), channel);
        channel.addListener(this);
    }

    public void sendMessage(String chatName, String message){
        if (channels.containsKey(chatName)){
            channels.get(chatName).sendMessage(message, name, "all", this);
        }
    }

}
