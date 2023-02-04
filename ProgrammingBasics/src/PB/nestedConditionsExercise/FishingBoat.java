package PB.nestedConditionsExercise;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermen = Integer.parseInt(scanner.nextLine());
        double shipPrice = 0;

        if (season.equals("Spring")) {
            shipPrice = 3000;
        } else if (season.equals("Winter")) {
            shipPrice = 2600;
        } else {
            shipPrice = 4200;
        }

        if (fishermen <= 6) {
            shipPrice = shipPrice - shipPrice * 0.1;
        } else if (fishermen <= 11) {
            shipPrice = shipPrice - shipPrice * 0.15;
        } else {
            shipPrice = shipPrice - shipPrice * 0.25;
        }

        if (fishermen % 2 == 0 && !season.equals("Autumn")) {
            shipPrice = shipPrice - shipPrice * 0.05;
        }

        double difference = Math.abs(budget - shipPrice);

        if (budget >= shipPrice) {
            System.out.printf("Yes! You have %.2f leva left.", difference);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", difference);
        }
    }
}
