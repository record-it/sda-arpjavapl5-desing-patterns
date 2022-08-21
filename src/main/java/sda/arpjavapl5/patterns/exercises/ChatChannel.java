package sda.arpjavapl5.patterns.exercises;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
public class ChatChannel {
    private List<ChatListener> listeners = new ArrayList<>();
    private final String name;

    public ChatChannel(String name) {
        this.name = name;
    }

    public void addListener(ChatListener listener){
        listeners.add(listener);
    }

    public void removeListener(ChatListener listener){
        listeners.remove(listener);
    }

    public void notifyAllListeners(ChatEvent event){
        listeners.
                stream()
                .filter(listener -> event.getSender() != listener)
        .forEach(l -> l.update(event));
    }

    public void sendMessage(String message, String from, String to, ChatListener sender){
        final ChatEvent event = ChatEvent.builder()
                .message(message)
                .to(to)
                .from(from)
                .sender(sender)
                .time(LocalDateTime.now())
                .channel(this)
                .build();
        notifyAllListeners(event);
    }
}
