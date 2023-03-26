package org.example;

import lombok.AllArgsConstructor;
import lombok.NonNull;

public class Developer extends InterestedPerson {
    public Developer(String name) {
        super(name);
    }

    @Override
    public void react(@NonNull Game game) {
        System.out.printf("I'm a developer '%s'! I'm working on %s and there are such system requirements as: [%s]\n", getName(),
                game.getName(), game.getSystemRequirements());
    }
}
