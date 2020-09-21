package main.java.tasks.day8;

import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        String a = "мама мыла раму мыла";
        String[] array = a.split(" ");

        List<String> myList = new java.util.ArrayList();

        for (int i = 0; i < array.length; i++) {
            myList.add(array[i]);
        }

        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }
}
