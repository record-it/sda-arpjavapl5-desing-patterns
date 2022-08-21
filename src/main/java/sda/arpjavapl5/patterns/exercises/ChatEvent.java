package sda.arpjavapl5.patterns.exercises;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Builder
@Data
public class ChatEvent {
    private String from;
    private String to;
    private ChatListener sender;
    private String message;
    private LocalDateTime time;
    private ChatChannel channel;

}
