package PB.nestedConditionsExercise;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowers = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double fullPrice = 0.0;

        if (flowers.equals("Roses")) {
            fullPrice = 5 * quantity;
            if (quantity > 80) {
                fullPrice = fullPrice - fullPrice * 0.1;
            }
        } else if (flowers.equals("Dahlias")) {
            fullPrice = 3.80 * quantity;
            if (quantity > 90) {
                fullPrice = fullPrice - fullPrice * 0.15;
            }
        } else if (flowers.equals("Tulips")) {
            fullPrice = 2.80 * quantity;
            if (quantity > 80) {
                fullPrice = fullPrice - fullPrice * 0.15;
            }
        } else if (flowers.equals("Narcissus")) {
            fullPrice = 3.0 * quantity;
            if (quantity < 120) {
                fullPrice = fullPrice + fullPrice * 0.15;
            }
        } else {
            fullPrice = 2.50 * quantity;
            if (quantity < 80) {
                fullPrice = fullPrice + fullPrice * 0.20;
            }
        }

        double difference = Math.abs(budget - fullPrice);

        if (budget >= fullPrice) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", quantity, flowers, difference);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", difference);
        }
    }
}
