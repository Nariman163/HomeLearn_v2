package gnm.learn.module1;

public class LessonByteInt {
    public static void main(String[] args) {
        byte b;
        int i;

        b= 10;
        i = b * b;
        b = (byte)(b * b);// Приводим обратно b в тип byte тк при умножении в " i = b * b;" b у нас автоматом привелось к int
        System.out.println("i and b = " + i + " " + b);
    }
}
