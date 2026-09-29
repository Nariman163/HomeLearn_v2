package gnm.learn.shildt.chapter3;

public class IfElseLessons {
    public static void main(String[] args) throws java.io.IOException {
        char ch, answer = 'K';
        System.out.println("Задумана буква между А и Z.");
        System.out.println("Попробуйте ее угадать: ");
        ch = (char) System.in.read();
        if (ch == answer)
            System.out.println("Правильно");
        else System.out.println("Увы, не угадали");
        //IncludeIf();// вызываем метод
        IfElseChain();
    }

    public static void IncludeIf() {
        int i = 10;
        int j = 19;
        int k = 110;
        if (i == 10) {
            if (j < 20) System.out.println("j < 20");
            if (k > 100) System.out.println("k > 100");
            else System.out.println("first else"); // относится к k > 100
        } else System.out.println("second else"); // относится к i==10
    }

    public static void IfElseChain() {
        int x;
        for (x = 0; x < 6; x++) {
            if (x == 1)
                System.out.println("x=1");
            else if (x==2)
            System.out.println("x=2");
            else if (x==3)
            System.out.println("x=3");
            else if (x==4)
            System.out.println("x=4");
            else
            System.out.println("Значение не находится между 1 и 4");
        }
    }
}

