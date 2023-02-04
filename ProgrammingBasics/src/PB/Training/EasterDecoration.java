package PB.Training;

import java.util.Scanner;

public class EasterDecoration {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int customersCount = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0;

        for (int i = 1; i <= customersCount; i++) {
            double price = 0;
            int purchaseCount = 0;
            String purchase = scanner.nextLine();
            while (!purchase.equals("Finish")) {
                switch (purchase) {
                    case "basket":
                        price = price + 1.50;
                        break;
                    case "wreath":
                        price = price +  3.80;
                        break;
                    case "chocolate bunny":
                        price = price +  7;
                    default:
                        break;
                }
                purchaseCount++;
                purchase = scanner.nextLine();
            }

            if (purchaseCount % 2 == 0) {
                price = price - price * 20 / 100;
            }

            totalPrice = totalPrice + price;

            System.out.printf("You purchased %d items for %.2f leva.%n", purchaseCount, price);
        }
        System.out.printf("Average bill per client is: %.2f leva.", totalPrice / customersCount);
    }
}
