package singleton_hero;

import java.util.HashMap;

public class Hero {
    private String name;
    private static HashMap<String, Hero> map = new HashMap<>();

    private Hero(String name) {
        this.name = name;
    }

    public static Hero getInstance(String name) {
        if (!map.containsKey(name)) {
            map.put(name, new Hero(name));
        }
        return map.get(name);
    }

    public String getName() {
        return name;
    }

}
