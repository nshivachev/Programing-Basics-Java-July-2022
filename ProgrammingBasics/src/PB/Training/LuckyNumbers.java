package PB.Training;

import java.util.Scanner;

public class LuckyNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int units = 1; units <= 9 ; units++) {
            for (int  tens = 1; tens <= 9; tens++) {
                for (int hundreds = 1; hundreds <= 9; hundreds++) {
                    for (int thousands = 1; thousands <= 9; thousands++) {
                        if ((units + tens) == (hundreds + thousands) && num % (units + tens) == 0) {
                            System.out.printf("%d%d%d%d ", units, tens, hundreds, thousands);
                        }
                    }
                }
            }
        }
    }
}
