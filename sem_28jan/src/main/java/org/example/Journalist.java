package org.example;

import lombok.AllArgsConstructor;
import lombok.NonNull;

public class Journalist extends InterestedPerson {
    public Journalist(String name) {
        super(name);
    }

    @Override
    public void react(@NonNull Game game) {
        System.out.printf("I'm a journalist '%s' and I would like to tell about '%s' game. It's short description: %s\n",
                getName(), game.getName(), game.getShortDescription());
    }
}
