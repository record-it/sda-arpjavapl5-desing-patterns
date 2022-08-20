package sda.arpjavapl5.patterns.memento_demo_app;

import sda.arpjavapl5.patterns.memento.GameState;
import sda.arpjavapl5.patterns.memento.Originator;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class GameBoardStateSaver {
    private final Originator originator;
    private Map<String, GameState> states = new HashMap<>();

    public void save(String key){
        final GameState state = originator.getState();
        states.put(key, state);
    }

    public void load(String key){
        if (states.containsKey(key)) {
            originator.setState(states.get(key));
        }
    }

    public GameBoardStateSaver(Originator originator) {
        this.originator = originator;
    }


}
