package PB.Exam2;

import java.util.Scanner;

public class ComputerRoom {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int hours = Integer.parseInt(scanner.nextLine());
        int group = Integer.parseInt(scanner.nextLine());
        String period = scanner.nextLine();

        double pricePerPerson;

        if (month.equals("march") || month.equals("april") || month.equals("may")) {
            if (period.equals("day")) {
                pricePerPerson = 10.50;
            } else {
                pricePerPerson = 8.40;
            }
        } else {
            if (period.equals("day")) {
                pricePerPerson = 12.60;
            } else {
                pricePerPerson = 10.20;
            }
        }

        if (group >= 4) {
            pricePerPerson = pricePerPerson - pricePerPerson * 10 / 100;
        }

        if (hours >= 5) {
            pricePerPerson = pricePerPerson - pricePerPerson * 50 / 100;
        }

        System.out.printf("Price per person for one hour: %.2f%n", pricePerPerson);
        System.out.printf("Total cost of the visit: %.2f", pricePerPerson * group * hours);
    }
}