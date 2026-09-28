package gnm.learn.hexlet.massive;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MassiveLearn {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getWeekends("short")));
    }
    //Допишите публичный статический метод getWeekends(), который возвращает массив из двух элементов – названий выходных дней на английском.
    // Метод принимает на вход параметр – формат возврата в виде строки. Всего есть два возможных значения:
    //"long" (по умолчанию) – массив содержит строки "saturday" и "sunday"
    //"short" – массив содержит строки "sat" и "sun"
    //// Вывод не показан, так как это равносильно ответу
    //
    //App.getWeekends("short");
    //App.getWeekends("long");
    //

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


}
