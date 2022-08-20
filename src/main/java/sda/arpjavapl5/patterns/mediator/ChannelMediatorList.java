package sda.arpjavapl5.patterns.mediator;

import java.util.List;

public class ChannelMediatorList implements ChannelMediator{
    private final List<ChatUser> users;

    public ChannelMediatorList(List<ChatUser> users) {
        this.users = users;
    }

    @Override
    public void broadcast(String message) {
        users.stream()
                .filter(ChatUser::isActive)
                .forEach(user -> user.addMessage(message));
    }

    @Override
    public void privateMessage(ChatUser user, String message) {
        users.stream()
                .filter(u -> u == user)
                .filter(ChatUser::isActive)
                .forEach(u-> u.addMessage(message));
    }
}
