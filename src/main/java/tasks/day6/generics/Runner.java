package main.java.tasks.day6.generics;

import java.util.Random;

public class Runner {
    public static void main(String[] args) {

        ObjectConteiner newContainer = new ObjectConteiner();

        for (int i = 0; i < 10; i++) {
            newContainer.add(i);
        }

        while (!newContainer.isEmpty()) {
            int x = (int) newContainer.removeLast();
            System.out.println(x);

        }
    }
}
