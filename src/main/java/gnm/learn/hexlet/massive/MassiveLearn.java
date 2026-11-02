package gnm.learn.hexlet.massive;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MassiveLearn {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getWeekends("short")));
        System.out.println(Arrays.toString(getWeekendsIf("long")));
    }
    //Допишите публичный статический метод getWeekends(), который возвращает массив из двух элементов – названий выходных дней на английском.
    // Метод принимает на вход параметр – формат возврата в виде строки. Всего есть два возможных значения:
    //"long" (по умолчанию) – массив содержит строки "saturday" и "sunday"
    //"short" – массив содержит строки "sat" и "sun"
    //// Вывод не показан, так как это равносильно ответу
    //App.getWeekends("short");
    //App.getWeekends("long");
    /// / Если передано любое другое значение параметра,
    /// / то это равносильно вызову с параметром "long"
    //App.getWeekends("a");
    public static String[] getWeekends(String format) {
        String[] longWeekends = {"saturday", "sunday"};
        String[] shortWeekends = {"sat", "sun"};
        System.out.println(longWeekends[0]);//Проверить как работает печать без Arrays
        switch (format) {
            case "long":
                return longWeekends;
            case "short":
                return shortWeekends;
            default:
                return longWeekends;
        }
    }
    //РЕШЕНИЕ ЧЕРЕЗ IF
    public static String[] getWeekendsIf(String format) {
        String[] longWeekendsIf = {"saturday", "sunday"};
        String[] shortWeekendsIf = {"sat", "sun"};
        if (format.equals("long")) {
            return longWeekendsIf;
        } else if (format.equals("short")){
            return shortWeekendsIf;
        } else {
            return longWeekendsIf;
        }

    }
    /*
    Допишите в файле src/main/java/io/hexlet/App.java публичный статический метод swap(), который принимает
    на вход массив целых чисел и меняет местами первый и последний элемент в переданном массиве.
    Если массив содержит меньше двух элементов, то он не меняется. Метод ничего не возвращает (void),
    результат его работы виден в самом переданном массиве.
    int[] numbers1 = {3};
    App.swap(numbers1);
    System.out.println(Arrays.toString(numbers1)); // => [3]

    int[] numbers2 = {1, 2, 3, 4};
    App.swap(numbers2);
    System.out.println(Arrays.toString(numbers2)); // => [4, 2, 3, 1]

    Количество элементов остаётся прежним, поэтому ArrayUtils можно не использовать
    Присваивание по индексу затирает старое значение элемента. Если оно ещё понадобится, сохраните его
    в переменную до присваивания
     */
    public static void swap(int[] numbers) {
        if (numbers.length > 1) {
          return;
        }
        int firstNumber = numbers[0];
        int lastNumber = numbers[numbers.length - 1];
        numbers[0] = lastNumber;
        numbers[numbers.length - 1] = firstNumber;
    }



}
