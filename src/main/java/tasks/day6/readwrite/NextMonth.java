package main.java.tasks.day6.readwrite;

import java.util.Scanner;

public class NextMonth {
    public static void main(String[] args) {
        nextMonth();
        System.out.println(nextMonth());
    }

    private static String nextMonth() {
        String[] months = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентбрь", "Октябрь", "Ноябрь", "Декабрь"};
        Scanner sc = new Scanner(System.in);
        String thisMonth = (String) sc;

        int i = 0;
        for (; i < months.length; i++) {
            if (months[i] == thisMonth) {
                break;
            }
        }
        return months[i + 1];
    }
}
