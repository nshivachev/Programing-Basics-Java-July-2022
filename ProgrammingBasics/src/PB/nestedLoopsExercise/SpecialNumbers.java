package PB.nestedLoopsExercise;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1111; i <= 9999; i++) {
            String currentNum = "" + i;
            boolean isSpecial = true;
            for (int j = 0; j < currentNum.length(); j++) {
                int currentDigit = Integer.parseInt("" + currentNum.charAt(j));
                if (currentDigit == 0 || n % currentDigit != 0) {
                    isSpecial = false;
                    break;
                }
            }
            if (isSpecial) {
                System.out.print(i + " ");
            }
        }
    }
}
