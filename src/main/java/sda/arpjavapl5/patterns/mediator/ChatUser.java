package sda.arpjavapl5.patterns.mediator;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Singular;

import java.util.ArrayList;
import java.util.List;

@Builder
@Data
public class ChatUser {
    private String name;
    private boolean active;
    private List<String> messages = new ArrayList<>();

    public void addMessage(String message){
        if(message != null && !message.isEmpty()) {
            messages.add(message);
        }
    }
}
