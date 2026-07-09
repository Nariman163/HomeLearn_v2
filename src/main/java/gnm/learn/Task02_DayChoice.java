package gnm.learn;

import gnm.learn.module1.DayChoice;

import java.util.Scanner;

public class Task02_DayChoice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите день недели от 1 до 7 ");
        int day = scanner.nextInt();

        DayChoice days = new DayChoice();
        String result = days.calcDays(day);
        System.out.println(result);
    }
}
