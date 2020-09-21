package main.java.tasks.day8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class QueueList {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Set<String> hashList = new HashSet<>();
        long time = System.currentTimeMillis();

        for (int i = 0; i < 10000000; i++) {
            queue.add("aaa");
        }

        System.out.println(System.currentTimeMillis() - time);

        time = System.currentTimeMillis();

        for (int i = 0; i < 10000000; i++) {
            queue.remove();
        }

        System.out.println(System.currentTimeMillis() - time);

        time = System.currentTimeMillis();

        for (int i = 0; i < 10000000; i++) {
            hashList.add("aaa");
        }

        System.out.println(System.currentTimeMillis() - time);

    }
}
