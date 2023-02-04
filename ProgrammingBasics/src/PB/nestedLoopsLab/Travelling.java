package PB.nestedLoopsLab;

import java.util.Scanner;

public class    Travelling {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();

        while (!destination.equals("End")) {

            double price = Double.parseDouble(scanner.nextLine());
            double savedMoney = Double.parseDouble(scanner.nextLine());

            while (price > savedMoney) {
                savedMoney += Double.parseDouble(scanner.nextLine());
            }

            System.out.printf("Going to %s!%n", destination);

            destination = scanner.nextLine();
        }
    }
}
