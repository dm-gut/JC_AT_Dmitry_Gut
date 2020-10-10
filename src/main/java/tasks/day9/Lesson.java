package main.java.tasks.day9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lesson {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("����", "����", "����", "����", "�����");

        list.stream().filter("����"::equals).count();

        if (list.stream().count() == 0)
            System.out.println("����");
        else
            System.out.println(list.stream().findFirst().get());

        System.out.println(list.stream().findFirst().orElse("����"));
        System.out.println(list.stream().findFirst());

        System.out.println(list.stream().filter("����"::equals).findFirst().get());

        System.out.println(list.stream().skip(4).findFirst().get());

        System.out.println(list.stream().skip(2).limit(2).collect(Collectors.toList()));

        System.out.println(list.stream().filter(s -> s.contains("�")).distinct().collect(Collectors.toList()));

        System.out.println(list.stream().anyMatch("����"::equals));

        System.out.println(list.stream().allMatch(s -> s.contains("�")));

        System.out.println(list.stream().map(s -> s + "m").collect(Collectors.toList()));

        System.out.println(list.stream().flatMap(s -> Arrays.stream(s.split("�"))).filter(s -> !s.equals("")).collect(Collectors.toList()));

        System.out.println(list.stream().sorted().collect(Collectors.toList()));

        System.out.println(list.stream().sorted((a, b) -> -a.compareTo(b)).distinct().collect(Collectors.toList()));

        System.out.println(list.stream().flatMap(s -> Arrays.stream(s.split(""))).peek(System.out::print).max(String::compareTo).get());

        System.out.println(list.stream().map(String::length).reduce((x, y) -> x + y).get());

        System.out.println(list.stream().mapToInt(String::length).sum());

        System.out.println(list.stream().flatMap(s -> Arrays.stream(s.split(""))).count());

        System.out.println((Integer) list.stream()
                .map(String::length)
                .mapToInt(i -> i % 2 == 1 ? 1 : 0)
                .sum());

        System.out.println(
                list
                .stream()
                .collect(Collectors.joining(":","<p>","</p>"))
        );

    }
}