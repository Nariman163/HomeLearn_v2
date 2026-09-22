package gnm.learn.algorithms;

public class IsPrime {
    public static void main(String[] args) {
        System.out.println(isPrimeNumber(5));
        isPrimeNumber(7);//Никуда не выводим
    }
    public static boolean isPrimeNumber(int number) {
        if (number < 2) {
            return false;
        }
        var divider = 2;
        while (divider <= number/2) {
            if (number % divider == 0) {
                return false;
            }
            divider++;
        }
        return true;
    }
}
