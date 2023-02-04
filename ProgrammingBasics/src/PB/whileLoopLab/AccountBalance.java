package PB.whileLoopLab;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String money = scanner.nextLine();
        double sum = 0;

        while (!money.equals("NoMoreMoney")) {
            if (Double.parseDouble(money) >= 0) {
                System.out.printf("Increase: %.2f%n", Double.parseDouble(money));
                sum += Double.parseDouble(money);
                money = scanner.nextLine();
            } else {
                System.out.println("Invalid operation!");
                break;
            }
        }

        System.out.printf("Total: %.2f", sum);
    }
}
