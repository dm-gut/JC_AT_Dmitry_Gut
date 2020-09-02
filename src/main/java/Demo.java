package main.java;

import java.util.Random;

public class Demo {

    public static void main(String[] args) {
        foo2();
    }

    /*    static void foo(){
            int i = 23;
            while (i < 28){
                if (i % 13 == 0){
                    System.out.println("continue!" + i++);
                    // break;
                    // return;
                    continue;
                }
                System.out.println("i is : " + i++);
            }
            System.out.println("number is : " + i);
        }
        */
    static void foo1() {
        int[][] array = {{1, 2, 5}, {1, 2, 7}, {1, 2, 4}, {1, 38, 2}, {1, 20, 2}};

       /* for (int i = 0; i < array.length; i++) {
            int[] inter = array[i];
            for (int j = 0; j < inter.length; j++) {
                System.out.print(inter[j]);
            }
            System.out.println();
        }
*/
/*        for (int[] a : array) {
            for (int b : a) {
                System.out.print(b);
            }
            System.out.println();

        }*/

    }
    public static void foo2(){
        Random random = new Random();
        int[] array = new int[random.nextInt(100)];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        int avg = 0;

        for (int i: array) {
            System.out.println("value is: " + i);
            avg += i;
        }
        System.out.println("Average value is: " + avg/array.length);
    }
}
