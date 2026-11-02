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
        String[] newString = new String[names.length];
        for (int i = 0; i < names.length;i++) {
            newString[i] = prefix + " " + names[i];
        } return newString;
    }
}
