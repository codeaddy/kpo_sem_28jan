package org.example;

import lombok.NonNull;

import java.util.ArrayList;
import java.util.List;

public class EventManager {
    final private List<EventListener> listeners = new ArrayList<>();

    public void subscribe(@NonNull EventListener listener) {
        listeners.add(listener);
    }

    public void unsubscribe(@NonNull EventListener listener) {
        listeners.remove(listener);
    }

    public void notify(@NonNull Game game) {
        for (var listener : listeners) {
            listener.react(game);
        }
    }
}
