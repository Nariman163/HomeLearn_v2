package gnm.learn.shildt.chapter3;

public class InputLessons {
    public static void main(String[] args)
        throws java.io.IOException {
            char ch;
            System.out.println("Нажмите клавишу и затем Enter");
            ch = (char)System.in.read(); //Получить символ
            System.out.println("Была нажата клавиша: " + ch);
        }
    }

