package PB.Exam;

import java.util.Scanner;

public class BraceletStand {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budgetPerDay = Double.parseDouble(scanner.nextLine());
        double moneyPerDay = Double.parseDouble(scanner.nextLine());
        double costsAllPeriod = Double.parseDouble(scanner.nextLine());
        double presentPrice = Double.parseDouble(scanner.nextLine());

        double profit = budgetPerDay * 5 + moneyPerDay * 5 - costsAllPeriod;

        if (profit >= presentPrice) {
            System.out.printf("Profit: %.2f BGN, the gift has been purchased.", profit);
        } else {
            System.out.printf("Insufficient money: %.2f BGN.", presentPrice - profit);
        }
    }
}
