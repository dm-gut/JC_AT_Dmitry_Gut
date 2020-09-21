package main.java.tasks.day6.readwrite;

import java.util.Scanner;

public class NextMonth {
    public static void main(String[] args) {

        String nextMonth;
        String[] months = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентбрь", "Октябрь", "Ноябрь", "Декабрь"};
        Scanner sc = new Scanner(System.in);
        String thisMonth = sc.nextLine();

        int i = 0;
        for (; i < months.length; i++) {
            if (months[i] == thisMonth) {
                break;
            } else {
                continue;
            }
        }
        nextMonth = months[i + 1];
        System.out.println(nextMonth);

    }
}

