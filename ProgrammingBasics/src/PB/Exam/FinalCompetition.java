package PB.Exam;

import java.util.Scanner;

public class FinalCompetition {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int dancersCount = Integer.parseInt(scanner.nextLine());
        double grade = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String place = scanner.nextLine();

        double sum;

        if (place.equals("Bulgaria")) {
            sum = grade * dancersCount;
            if (season.equals("summer")) {
                sum = sum - sum * 5 / 100;
            } else {
                sum = sum - sum * 8 / 100;
            }
        } else {
            sum = grade * dancersCount;
            sum = sum + sum * 50 / 100;
            if (season.equals("summer")) {
                sum = sum - sum * 10 / 100;
            } else {
                sum = sum - sum * 15 / 100;
            }
        }

        double charity = sum * 75 / 100;
        double finalSum = sum - charity;
        double moneyPerDancer = finalSum / dancersCount;

        System.out.printf("Charity - %.2f%n", charity);
        System.out.printf("Money per dancer - %.2f", moneyPerDancer);
    }
}
