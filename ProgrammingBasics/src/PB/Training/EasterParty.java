package PB.Training;

import java.util.Scanner;

public class EasterParty {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int guestsCount = Integer.parseInt(scanner.nextLine());
        double pricePerGest = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        double cakePrice = budget * 10 / 100;

        if (guestsCount >= 10 && guestsCount <= 15) {
            pricePerGest = pricePerGest - pricePerGest * 15 / 100;
        } else if (guestsCount >= 16 && guestsCount <= 20) {
            pricePerGest = pricePerGest - pricePerGest * 20 / 100;
        } else if (guestsCount > 21) {
            pricePerGest = pricePerGest - pricePerGest * 25 / 100;
        }

        double totalPrice = guestsCount * pricePerGest + cakePrice;
        double diff = Math.abs(budget - totalPrice);

        if (budget >= totalPrice) {
            System.out.printf("It is party time! %.2f leva left.", diff);
        } else {
            System.out.printf("No party! %.2f leva needed.", diff);
        }
    }
}
