package PB.forLoopExercise;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int maxNumber = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sum += number;
            if (number > maxNumber)
                maxNumber = number;
         }

        int sumWithoutMaxNumber = sum - maxNumber;

        if (maxNumber == sumWithoutMaxNumber)
            System.out.printf("Yes%nSum = %d", maxNumber);
        else
            System.out.printf("No%nDiff = %d", Math.abs(maxNumber - sumWithoutMaxNumber));
    }
}
