package main.java.tasks.day8;

import java.util.HashSet;
import java.util.Set;

public class TreeSet {
    public static void main(String[] args) {
        String a = "мама мыла раму мыла";

        Set<String> myList1 = new HashSet<>();
        Set<String> myList2 = new java.util.TreeSet<>();

        long firstTime = System.currentTimeMillis();

        for (int i = 0; i < 10000000; i++) {
            myList1.add(a+i);
        }
        System.out.println(System.currentTimeMillis() - firstTime);

        firstTime = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            myList2.add(a+i);
        }
        System.out.println(System.currentTimeMillis() - firstTime);
    }
}
