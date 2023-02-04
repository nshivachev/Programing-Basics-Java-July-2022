package PB.Training;

import java.util.Scanner;

public class DivisionWithoutRemainder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int counterTwo = 0;
        int counterThree = 0;
        int counterFour = 0;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number % 2 == 0) {
                counterTwo++;
            }

            if (number % 3 == 0) {
                counterThree++;
            }

            if (number % 4 == 0) {
                counterFour++;
            }
        }

        System.out.printf("%.2f%%%n", counterTwo * 1.0 / n * 100);
        System.out.printf("%.2f%%%n", counterThree * 1.0 / n * 100);
        System.out.printf("%.2f%%%n", counterFour * 1.0 / n * 100);
    }
}
