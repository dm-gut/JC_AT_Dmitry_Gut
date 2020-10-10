//для всех четных значений длин от 1 до 20 дюймов вывести в консоль значения в дюймах, певерести значения в сантиметры и найти сумму
package main.java.tasks.day10;

import java.util.stream.IntStream;

public class InchToCentimeter {
    public static void main(String[] args) {

        int k = 1;
        int l = 21;
        IntStream.range(k, l)
                .filter(i -> i % 2 == 0)
                .peek(i -> System.out.println(i * 2.54 + " centimeters in " + k + " inche(-s)"))
                .reduce(Integer::sum)
                .ifPresent(System.out::println);
    }
}
