package main.java.tasks.day8;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> words = new HashMap<Integer, String>();

        words.put(1, "first");
        words.put(2, "second");
        words.put(3, "third");

        System.out.println("Map :" + words);
        System.out.println("Word is " + words.get(3));

        String foo  = "мама мыла раму мыла";
        String[] bar = foo.split(" ");

        Map<Integer, String> baz = new HashMap<Integer, String>();

        for (int i = 0; i < bar.length; i++) {
            baz.put(i, bar[i]);
        }

        System.out.println(baz.keySet());
        System.out.println(baz.values());

        Set<Map.Entry<Integer, String>> entries = baz.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}

