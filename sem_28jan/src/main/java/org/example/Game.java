package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
public class Game {
    private String name;
    private String shortDescription;
    private List<String> availableAchievements = new ArrayList<>();
    private Map<String, String> systemRequirements = new HashMap<>();
}
