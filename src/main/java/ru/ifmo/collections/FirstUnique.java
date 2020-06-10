package ru.ifmo.collections;


import java.util.LinkedHashMap;

/**
 * Design a class which contains integers and returns first unique integer (in order of addition).
 * FirstUniqueTest can be used as an example.
 */
public class FirstUnique {
    private final LinkedHashMap<Integer, Boolean> linkedMap;

    public FirstUnique(int[] numbers) {
        linkedMap = new LinkedHashMap<>();
        for (var num : numbers) {
            this.add(num);
        }
    }

    public int showFirstUnique() {
        for (var entry : linkedMap.entrySet()) {
            if (entry.getValue()) {
                return entry.getKey();
            }
        }
        return -1;
    }

    public void add(int value) {
        boolean isFirst = linkedMap.get(value) == null;
        linkedMap.put(value, isFirst);
    }
}
