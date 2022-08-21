package sda.arpjavapl5.patterns.exercises;

import lombok.Data;

//Zaimplementuj licznik wiadomości na kanale
@Data
public class ChatChannelStatistic implements ChatListener{
    private int counter;
    @Override
    public void update(ChatEvent event) {
        counter++;
    }
}
