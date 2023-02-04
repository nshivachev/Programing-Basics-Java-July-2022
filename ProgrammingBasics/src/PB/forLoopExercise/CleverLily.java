package PB.forLoopExercise;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washingМachine = Double.parseDouble(scanner.nextLine());
        int toySinglePrice = Integer.parseInt(scanner.nextLine());
        double money = 0;
        int toys = 0;
        int moneyPeriod = 0;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0)
                money = money + ++moneyPeriod * 10;
            else
                toys++;
        }
        money -= moneyPeriod;
        money += toys * toySinglePrice;
        double diff = Math.abs(washingМachine - money);

        if (washingМachine <= money)
            System.out.printf("Yes! %.2f", diff);
        else
            System.out.printf("No! %.2f", diff);
    }
}
