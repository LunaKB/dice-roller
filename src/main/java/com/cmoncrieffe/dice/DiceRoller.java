package com.cmoncrieffe.dice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DiceRoller {

    private DiceRoller() {}

    public static int roll0Based(DiceSize size) {
        return (int) (Math.random() * size.getSize());
    }

    public static int roll1Based(DiceSize size) {
        return roll0Based(size) + 1;
    }

    public static List<Integer> roll0Based(DiceSize size, int amount) {
        List<Integer> results = new ArrayList<>();
        for (int count = 0; count < amount; count++) {
            results.add(roll0Based(size));
        }
        return results;
    }

    public static List<Integer> roll1Based(DiceSize size, int amount) {
        return roll0Based(size, amount)
                .stream()
                .map(integer -> integer + 1)
                .collect(Collectors.toList());
    }
}
