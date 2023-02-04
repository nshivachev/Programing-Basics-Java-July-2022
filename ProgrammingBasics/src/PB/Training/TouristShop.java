package PB.Training;

import java.util.Scanner;

public class TouristShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String productName = scanner.nextLine();
        boolean tooBigPrice = false;
        int productCount = 0;
        double totalPrice = 0;
        int discount = 1;

        while (!productName.equals("Stop")) {
            double productPrice = Double.parseDouble(scanner.nextLine());

            if (discount % 3 == 0) {
                productPrice = productPrice / 2;
            }

            totalPrice = totalPrice + productPrice;

            if (totalPrice > budget) {
                tooBigPrice = true;
                break;
            }

            discount++;
            productCount++;
            productName = scanner.nextLine();
        }

        if (tooBigPrice) {
            System.out.println("You don't have enough money!");
            System.out.printf("You need %.2f leva!", totalPrice - budget);
        } else {
            System.out.printf("You bought %d products for %.2f leva.", productCount, totalPrice);
        }
    }
}
