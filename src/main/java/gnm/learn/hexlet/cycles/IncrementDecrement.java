package gnm.learn.hexlet.cycles;

public class IncrementDecrement {
    public static void main(String[] args) {
        int numOne = 5;
        System.out.println(numOne++);
        System.out.println(numOne--);

        int numTwo = 7;
        System.out.println("\n"+ ++numTwo);
        System.out.println(--numTwo);

        int numThree = 10;
        numThree++;
        System.out.println("\n" + numThree);
    }
}
