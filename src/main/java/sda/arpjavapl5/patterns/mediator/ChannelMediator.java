package sda.arpjavapl5.patterns.mediator;

public interface ChannelMediator {
    void broadcast(String message);
    void privateMessage(ChatUser user, String message);
}
