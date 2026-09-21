package gnm.learn.hexlet.cycles;

public class CyclesLearn {
    public static void main(String[] args) {
        //System.out.println(reverseString("Marina"));
        //System.out.println(reverseStringEnd("Nariman"));
        //System.out.println(filterString("Test",'t'));
        System.out.println(makeItFunny("Test make", 3));
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
            i-=1;
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

            if((i + 1) % n == 0) {
                result = result + Character.toUpperCase(str.charAt(i));
            } else {
                result = result + str.charAt(i);
            }
            i += 1;
        }
        return result;
    }
}
