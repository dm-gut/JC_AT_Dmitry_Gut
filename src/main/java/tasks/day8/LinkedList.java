package main.java.tasks.day8;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new java.util.LinkedList<>();

        long firstTime = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            arrayList.add("aaa");
        }
        System.out.println(System.currentTimeMillis() - firstTime);

        firstTime = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            linkedList.add("aaa");
        }
        System.out.println(System.currentTimeMillis() - firstTime);
    }
}
