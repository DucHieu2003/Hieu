package oop.collections.exercises;

import java.util.*;

public class Maps {
    public static int count(Map<Integer, Integer> map) {
        if (map.isEmpty()) return 0;
        return map.size();
    }

    public static void empty(Map<Integer, Integer> map) {
        map.clear();
    }

    public static boolean contains(Map<Integer, Integer> map, int key) {
        return map.containsKey(key);
    }

    public static boolean containsKeyValue(Map<Integer, Integer> map, int key, int value) {
        if (map == null) return false;
        if (map.containsKey(key)) {
            int num = map.get(key);
            return num == value;
       }
        return map.containsKey(key) && map.get(key) == value;
    }

    public static Set<Integer> keySet(Map<Integer, Integer> map) {
        if (map == null) return null;
        return map.keySet();
    }

    public static Collection<Integer> values(Map<Integer, Integer> map) {
        if (map == null) return null;
        return map.values();
    }

//    public static String getColor(int value) {
//
//    }
}
