package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Player extends InterestedPerson {
    public Player(String name) {
        super(name);
    }

    @Override
    public void react(@NonNull Game game) {
        System.out.printf("Hey, I'm player '%s'! I'm playing %s and there are such achievements as: [%s]\n", getName(),
                game.getName(), game.getAvailableAchievements());
    }
}
