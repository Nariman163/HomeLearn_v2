package gnm.learn.hexlet.cycles;

public class CyclesLearn {
    public static void main(String[] args) {
        //System.out.println(reverseString("Marina"));
        //System.out.println(reverseStringEnd("Nariman"));
        //System.out.println(filterString("Test",'t'));
        //System.out.println(makeItFunny("Test make", 3));
        //System.out.println(hasChar("Test", 'T'));
        //System.out.println(reverseStringFor("Test"));
        // System.out.println(encript("attack"));
        System.out.println(compress("aaabcccc"));
    }

    //Переворот строки, перебор с первого символа
    public static String reverseString(String str) {
        var i = 0;
        var result = "";
        while (i < str.length()) {
            result = str.charAt(i) + result;
            i += 1;
        }
        return result;
    }

    //Реализуйте такой же метод reverse(), но выполняющий обход строки не с первого элемента по последний, а наоборот, от последнего к первому.
    public static String reverseStringEnd(String str) {
        var i = str.length() - 1;
        var result = "";
        while (i >= 0) {
            result = result + str.charAt(i);
            i -= 1;
        }
        return result;
    }

    //Реализуйте статический метод App.filterString(), принимающую на вход строку и символ, и возвращающую новую строку, в которой удален переданный символ во всех его позициях.
    public static String filterString(String str, char ch) {
        var i = 0;
        var result = "";
        while (i < str.length()) {
            if (str.charAt(i) != ch) {
                result = result + str.charAt(i);
            }
            i += 1;
        }
        return result;
    }

    //Реализуйте статический метод App.makeItFunny(), который принимает на вход строку и возвращает её копию, у которой каждый n-ный элемент переведен в верхний регистр. n – задается на входе в функцию. Для определения каждого n-ного элемента понадобится остаток от деления %. Подумайте, как его можно использовать.
    public static String makeItFunny(String str, int n) {
        var i = 0;
        var result = "";
        while (i < str.length()) {

            if ((i + 1) % n == 0) {
                result = result + Character.toUpperCase(str.charAt(i));
            } else {
                result = result + str.charAt(i);
            }
            i += 1;
        }
        return result;
    }

    //Реализуйте статический метод App.hasChar(), который проверяет (с учётом регистра), содержит ли строка указанную букву.
    //Метод принимает два параметра:
    //Строка
    //Буква для поиска
    public static boolean hasChar(String str, char ch) {
        var i = 0;
        while (i < str.length()) {
            if (str.charAt(i) == ch) {
                return true;
            }
            i++;
        }
        return false;
    }

    //Переворот строки с помощью FOR
    public static String reverseStringFor(String str) {
        var result = "";
        for (var i = 0; i < str.length(); i++) {
            result = str.charAt(i) + result;
        }
        return result;
    }

    //Сэмвелл обнаружил, что его сообщения перехватываются в замке «Близнецы» и там читаются. Из-за этого их атаки перестали быть внезапными.
    //Немного подумав, он разработал программу, которая бы шифровала сообщения по следующему алгоритму.
    //Она бы брала текст и переставляла в нем каждые два подряд идущих символа.
    //Реализуйте статический метод App.encrypt(), который принимает на вход исходное сообщение и возвращает зашифрованное.
    //Пример
    // App.encrypt("move"); // "omev"
    //App.encrypt("attack"); // "taatkc"

    /// / Если число символов нечётное
    /// / то последний символ остается на своем месте
    public static String encript(String str) {
        var result = "";
        for (var i = 0; i < str.length(); i += 2) {
            if (i + 1 < str.length()) {
                result = result + str.charAt(i + 1) + str.charAt(i);
            } else
                result = result + str.charAt(i);
        }
        return result;
    }

    //Реализуйте метод compress(), который сжимает строку методом RLE (Run-Length Encoding).
    //Алгоритм такой: если символ повторяется несколько раз подряд, он заменяется на сам символ и количество повторений.
    // Одиночные символы записываются без цифры.
    //
    //App.compress("aaabcccc"); // => "a3bc4"
    //App.compress("abcd");      // => "abcd"
    //App.compress("aabbaa");    // => "a2b2a2"
    //App.compress("");          // => ""
    //Подсказки:
    //
    //идите по строке и считайте, сколько одинаковых символов идет подряд;
    //как только символ меняется, дописывайте предыдущий символ и его счетчик (если он больше единицы), а счетчик сбрасывайте;
    //не забудьте обработать последнюю группу символов после завершения цикла;
    //если что-то идет не так, добавьте отладочную печать значений i, текущего символа и счетчика — это поможет увидеть, где ломается логика.
    public static String compress(String str) {
        var result = "";
        var count = 1;
        for (var i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                result = result + str.charAt(i - 1);
                if (count > 1) {
                    result = result + count;
                }
                count = 1;
            }
            }
        result = result + str.charAt(str.length() - 1);
        if (count > 1) {
            result = result + count;

        }
        return result;
    }
}
