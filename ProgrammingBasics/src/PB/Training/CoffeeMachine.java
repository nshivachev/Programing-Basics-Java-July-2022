package PB.Training;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String drink = scanner.nextLine();
        String sugar = scanner.nextLine();
        int drinkCount = Integer.parseInt(scanner.nextLine());

        double price = 0;

        if (drink.equals("Espresso")) {
            if (sugar.equals("Without")) {
                price = drinkCount * 0.90;
            } else if (sugar.equals("Normal")) {
                price = drinkCount;
            } else {
                price = drinkCount * 1.20;
            }
        } else if (drink.equals("Cappuccino")) {
            if (sugar.equals("Without")) {
                price = drinkCount;
            } else if (sugar.equals("Normal")) {
                price = drinkCount * 1.20;
            } else {
                price = drinkCount * 1.60;
            }
        } else {
            if (sugar.equals("Without")) {
                price = drinkCount * 0.50;
            } else if (sugar.equals("Normal")) {
                price = drinkCount * 0.60;
            } else {
                price = drinkCount * 0.70;
            }
        }

        if (sugar.equals("Without")) {
            price = price - price * 35 / 100;
        }

        if (drink.equals("Espresso") && drinkCount >= 5) {
            price = price - price * 25 / 100;
        }

        if (price > 15) {
            price = price - price * 20 / 100;
        }

        System.out.printf("You bought %d cups of %s for %.2f lv.", drinkCount, drink, price);
    }
}
