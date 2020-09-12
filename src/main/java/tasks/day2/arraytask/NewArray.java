/*      - создать пустой массив типа int и размера n = 7
        - заполнить его случайными элементами используя Random.nextInt(n)
        - пройти по массиву и вывести все элементы
        - вывести все элементы в обратном порядке
        - каждый элемент умножить на 5 и вывести результат
        - каждый элемент возвести в квадрат и вывести результат
        - найти минимальный элемент массива и вывести результат
        - поменять местами первый и последний элементы и вывести результат
        - отсортировать элементы массива в порядке убывания (любым способом)*/

package main.java.tasks.day2.arraytask;

import java.util.Random;

public class NewArray {
    public static void main(String[] args) {
        int n = 7;
        int newArray[] = new int[n];

        Random rand = new Random();
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = rand.nextInt(n);
        }

        for (int a = 0; a < n; a++) {
            System.out.print(newArray[a] + " ");
        }

        System.out.println();

        for (int b = n - 1; b >= 0; b--) {
            System.out.print(newArray[b] + " ");
        }

        System.out.println();

        for (int c = 0; c < n; c++) {
            newArray[c] = newArray[c] * 5;
            System.out.print(newArray[c] + " ");
        }

        System.out.println();

        for (int d = 0; d < n; d++) {
            newArray[d] = newArray[d] * newArray[d];
            System.out.print(newArray[d] + " ");
        }

        System.out.println();

        int f = newArray[0];
        for (int e = 0; e < n; e++) {
            if (newArray[e] < f) {
                f = newArray[e];
            }
        }
        System.out.println(f);

        int g = newArray[0];
        int h = newArray[newArray.length - 1];
        newArray[0] = h;
        newArray[newArray.length - 1] = g;
        for (int k = 0; k < n; k++) {
            System.out.print(newArray[k] + " ");
        }

        System.out.println();

        for (int x = 1; x < newArray.length; x++) {
            for (int y = newArray.length - 1; y >= x; y--) {
                if (newArray[y - 1] > newArray[y]) {
                    int z = newArray[y - 1];
                    newArray[y - 1] = newArray[y];
                    newArray[y] = z;
                }
            }
        }
        for (int j = 0; j < newArray.length; j++) {
            System.out.print(newArray[j] + " ");
        }
    }
}
