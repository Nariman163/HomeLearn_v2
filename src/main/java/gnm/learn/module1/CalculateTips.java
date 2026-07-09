package gnm.learn.module1;


import java.util.Scanner;

public class CalculateTips {
    public double calcTips(Scanner scanner) {

        System.out.println("Введите сумму счета");
        double bill = scanner.nextDouble();

        System.out.println("Введите процент чаевых");
        double tips = scanner.nextDouble();

        double sumTips = (bill * tips) / 100;
        double finalScore = bill + sumTips;

        return finalScore;

    }
}
