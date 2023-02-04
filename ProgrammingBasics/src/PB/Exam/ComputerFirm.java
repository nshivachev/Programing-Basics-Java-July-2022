package PB.Exam;

import java.util.Scanner;

public class ComputerFirm {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int modelsCount = Integer.parseInt(scanner.nextLine());
        double totalRating = 0;
        double totalSells = 0;

        for (int i = 1; i <= modelsCount; i++) {
            int sellsRating = Integer.parseInt(scanner.nextLine());
            int rating = sellsRating % 10;
            int sells = sellsRating / 10;
            double realSells = 0;

            switch (rating) {
                case 2:
                    realSells = sells * 0 / 100;
                    break;
                case 3:
                    realSells = sells * 50.0 / 100;
                    break;
                case 4:
                    realSells = sells * 70.0 / 100;
                    break;
                case 5:
                    realSells = sells * 85.0 / 100;
                    break;
                case 6:
                    realSells = sells * 100.0 / 100;
                    break;
                default:
                    break;
            }

            totalRating += rating;
            totalSells += realSells;
        }

        System.out.printf("%.2f%n", totalSells);
        System.out.printf("%.2f", totalRating / modelsCount);
    }
}
