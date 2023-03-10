package PB.forLoopLab;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numCount = Integer.parseInt(scanner.nextLine());
        int sumLeft = 0;
        int sumRight = 0;

        for (int i = 1; i <= numCount; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            sumLeft = sumLeft + num;
        }

        for (int i = 1; i <= numCount; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            sumRight = sumRight + num;
        }

        if (sumLeft == sumRight) {
            System.out.printf("Yes, sum = %d", sumLeft);
        } else {
            System.out.printf("No, diff = %d", Math.abs(sumLeft - sumRight));
        }
    }
}
