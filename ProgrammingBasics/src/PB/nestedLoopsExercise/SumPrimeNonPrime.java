package PB.nestedLoopsExercise;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String num = scanner.nextLine();
        int primeSum = 0;
        int nonPrimeSum = 0;

        while (!num.equals("stop")) {
            boolean isPrimeNum = true;
            int currentNum = Integer.parseInt(num);

            for (int i = 2; i < currentNum; i++) {
                if (currentNum % i == 0) {
                    isPrimeNum = false;
                    break;
                }
            }

            num = scanner.nextLine();

            if (currentNum < 0) {
                System.out.println("Number is negative.");
            } else if (isPrimeNum) {
                primeSum += currentNum;
            } else {
                nonPrimeSum += currentNum;
            }
        }

        System.out.println("Sum of all prime numbers is: " + primeSum);
        System.out.println("Sum of all non prime numbers is: " + nonPrimeSum);
    }
}
