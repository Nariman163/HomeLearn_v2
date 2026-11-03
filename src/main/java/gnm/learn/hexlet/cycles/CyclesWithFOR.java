package gnm.learn.hexlet.cycles;

public class CyclesWithFOR {
    public static void main(String[] args) {

    }
    /*
    Реализуйте в файле src/main/java/io/hexlet/App.java публичный статический метод addPrefix(), который
    принимает на вход массив строк String[] и строковый префикс String, и возвращает новый массив
    строк String[], в котором к каждому элементу исходного массива добавляется переданный префикс.
    После префикса автоматически добавляется пробел.

    String[] names = {"John", "Smit", "Karl"};
    var namesWithPrefix = App.addPrefix(names, "Mr.");
    System.out.println(Arrays.toString(namesWithPrefix));
    // => [Mr. John, Mr. Smit, Mr. Karl]

    var namesWithMrs = App.addPrefix(names, "Mrs.");
    System.out.println(Arrays.toString(namesWithMrs));
    // => [Mrs. John, Mrs. Smit, Mrs. Karl]

    System.out.println(Arrays.toString(names)); // Исходный массив не меняется
    // => [John, Smit, Karl]
    Подсказки
    Префикс это строка, которую дописывают перед каждым элементом. Новый массив той же длины создаётся
    выражением new String[names.length], и его элементы заполняются в цикле. Исходный массив при этом
    не меняется, иначе второй вызов допишет префикс к уже изменённым строкам

    Тип результата метода, который возвращает массив строк, записывается как String[] перед именем метода.
     В return указывается только переменная с массивом
     */

    public static String[] addPrefix(String[] names, String prefix){
        var length = names.length;
        String[] newString = new String[length];
        for (int i = 0; i < names.length;i++) {
            newString[i] = prefix + " " + names[i];
        } return newString;
    }
    /*
    Реализуйте в файле src/main/java/io/hexlet/App.java публичный статический метод calculateSum(), который
    принимает в качестве аргумента массив целых чисел. Метод высчитывает и возвращает сумму всех элементов
    массива, которые делятся без остатка на 3 (три). В случае пустого массива метод должен вернуть 0.

    int[] numbers = {8, 9, 21, 19, 18, 22, 7};
    App.calculateSum(numbers); // 48
    Подсказки:
    Число делится на три без остатка, когда остаток от деления на три равен нулю, то есть value % 3 == 0
     */
    public static Integer calculateSum(int[] numbers) {
        if (numbers.length ==0) {
            return 0;
        }
        var sum = 0;
        var devider = 3;
        for (var i = 0; i < numbers.length; i++) {
            if (numbers[i] % devider ==0)
            sum+=numbers[i];
        }
        return sum;
    }

}
