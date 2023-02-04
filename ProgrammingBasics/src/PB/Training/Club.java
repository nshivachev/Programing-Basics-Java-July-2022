package PB.Training;

import java.util.Scanner;

public class Club {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double wantedProfit = Double.parseDouble(scanner.nextLine());
        String cocktailName = scanner.nextLine();
        double totalPrice = 0;
        double orderPrice = 0;
        boolean targetAcquired = false;

        while (!cocktailName.equals("Party!")) {
            int cocktailPrice = cocktailName.length();
            int cocktailCount = Integer.parseInt(scanner.nextLine());
            orderPrice = cocktailPrice * cocktailCount;

            if (orderPrice % 2 != 0) {
                orderPrice = orderPrice - orderPrice * 25 / 100;
            }

            totalPrice = totalPrice + orderPrice;

            if (totalPrice >= wantedProfit) {
                targetAcquired = true;
                break;
            }

            cocktailName = scanner.nextLine();
        }

        if (cocktailName.equals("Party!")) {
            System.out.printf("We need %.2f leva more.%n", wantedProfit - totalPrice);
        } else if (targetAcquired) {
            System.out.println("Target acquired.");
        }

        System.out.printf("Club income - %.2f leva.", totalPrice);
    }
}
