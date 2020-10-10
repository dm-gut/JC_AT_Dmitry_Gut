package main.java.tasks.day9.people;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class People {

    public static void main(String[] args) {
        List<Person> list = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMEN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMEN),
                new Person("Роман Петрович", 72, Person.Sex.MAN)
        );

        System.out.println(list.stream().filter(p -> (p.sex == Person.Sex.MAN && p.age >= 18 && p.age <= 60) ||
                (p.sex == Person.Sex.WOMEN && p.age >= 18 && p.age <= 55)).count());

        list.stream().sorted(
                    (o1,o2) -> o1.sex != o2.sex ? o1.sex.compareTo(o2.sex) : o1.age - o2.age)
                    .peek(p -> System.out.println(p.name))
                    .collect(Collectors.toList());

        System.out.println(list.stream().min(Comparator.comparingInt(p -> p.age)).get().name);

        System.out.println(
                list
                .stream()
                .collect(Collectors.toMap(p -> p.hashCode(), p -> p))
        );


                list
                .stream()
                .collect(Collectors.groupingBy(p -> p.sex))
                .keySet()
                .forEach(System.out::println);

    }
}
