package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Game godOfWar = new Game(
                "God Of War",
                "In God of War, players control Kratos, a Spartan warrior who is sent by the Greek gods to kill Ares, " +
                        "the god of war",
                List.of("The Journey Begins", "A New Friend", "Feels Like Home"),
                Map.of("CPU", "Intel Core i7-12700k", "Videocard", "NVIDIA RTX 3050"));

        Game csgo = new Game(
                "Counter-Strike: Global Offensive",
                "The game pits two teams, Terrorists and Counter-Terrorists, against each other in " +
                        "different objective-based game modes",
                List.of("Awardist", "Points in Your Favor", "War Bonds", "Rampage!"),
                Map.of("CPU", "Intel Core i5-9400f", "Videocard", "NVIDIA GTX 1060", "HDD",
                        "100gb"));

        Player player1 = new Player("Player1");
        Player player2 = new Player("Player2");
        Player player3 = new Player("Player3");

        Developer developer1 = new Developer("Developer1");
        Developer developer2 = new Developer("Developer2");
        Developer developer3 = new Developer("Developer3");

        Journalist journalist1 = new Journalist("Journalist1");
        Journalist journalist2 = new Journalist("Journalist2");

        EventManager eventManager = new EventManager();

        eventManager.subscribe(player1);
        eventManager.subscribe(player3);
        eventManager.subscribe(developer1);
        eventManager.subscribe(journalist2);

        eventManager.notify(godOfWar);

        System.out.println();

        eventManager.subscribe(player2);
        eventManager.subscribe(developer2);
        eventManager.subscribe(developer3);
        eventManager.subscribe(journalist1);

        eventManager.unsubscribe(player1);
        eventManager.unsubscribe(player3);
        eventManager.unsubscribe(developer1);

        eventManager.notify(csgo);
    }
}