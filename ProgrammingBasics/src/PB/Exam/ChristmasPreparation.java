package PB.Exam;

import java.util.Scanner;

public class ChristmasPreparation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int paperCount = Integer.parseInt(scanner.nextLine());
        int clothCount = Integer.parseInt(scanner.nextLine());
        double glueCount = Double.parseDouble(scanner.nextLine());
        int discountPercent = Integer.parseInt(scanner.nextLine());

        double paperPrice = paperCount * 5.80;
        double clothPrice = clothCount * 7.20;
        double gluePrice = glueCount * 1.20;

        double sum = paperPrice + clothPrice + gluePrice;

        double finalSum = sum - sum * discountPercent / 100;

        System.out.printf("%.3f", finalSum);
    }
}
