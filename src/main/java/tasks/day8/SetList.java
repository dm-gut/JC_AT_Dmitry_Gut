package main.java.tasks.day8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetList {
    public static void main(String[] args) {
        String a = "мама мыла раму мыла";
        String[] array = a.split(" ");

        Set<String> myList = new HashSet<>();


        for (int i = 0; i < array.length; i++) {
            myList.add(array[i]);
        }

        Iterator<String> iterator = myList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
