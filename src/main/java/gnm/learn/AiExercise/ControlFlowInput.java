package gnm.learn.AiExercise;

import java.util.Scanner;

/*Упражнение 1 — Условия + ввод данных (Шилдт, гл. 3)
«Классификатор чисел»
Программа, которая читает целое число с клавиатуры и классифицирует его:
Положительное / Отрицательное / Ноль
Чётное / Нечётное (для ненулевых)
Простое или составное (базовая проверка)
*/
public class ControlFlowInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        var number = scanner.nextInt();
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else if (number == 0) {
            System.out.println("Zero");
        }

        //Четное нечетное
        if (number % 2 == 0) {
            System.out.println("Even");
        } else if (number % 2 != 0) {
            System.out.println("Odd");
        }
        //Простое/Составное
        if (isPrime(number)) {
            System.out.println("Prime");
        } else if (number > 1) {
            System.out.println("Composite");
        } else {
            System.out.println("Not a number");
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
