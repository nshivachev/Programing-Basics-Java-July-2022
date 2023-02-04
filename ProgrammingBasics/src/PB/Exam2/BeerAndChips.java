package PB.Exam2;

import java.util.Scanner;

public class BeerAndChips {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double budget = Double.parseDouble(scanner.nextLine());
        int beerCount = Integer.parseInt(scanner.nextLine());
        int chipsCount = Integer.parseInt(scanner.nextLine());

        double totalBeerPrice = 1.20 * beerCount;
        double chipsPrice = totalBeerPrice * 45 / 100;
        double totalChipsPrice = Math.ceil(chipsPrice * chipsCount);
        double totalPrice = totalChipsPrice + totalBeerPrice;

        double diff = Math.abs(budget - totalPrice);

        if (budget >= totalPrice) {
            System.out.printf("%s bought a snack and has %.2f leva left.", name, diff);
        } else {
            System.out.printf("%s needs %.2f more leva!", name, diff);
        }

    }
}
