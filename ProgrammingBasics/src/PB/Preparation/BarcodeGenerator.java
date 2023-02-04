package PB.Preparation;

import java.util.Scanner;

public class BarcodeGenerator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());

        int fourthDigitN1 =  n1 % 10;
        int thirdDigitN1 = n1 / 10 % 10;
        int secondDigitN1 = n1 / 100 % 10;
        int firstDigitN1 = n1 / 1000 % 10;

        int fourthDigitN2 =  n2 % 10;
        int thirdDigitN2 = n2 / 10 % 10;
        int secondDigitN2 = n2 / 100 % 10;
        int firstDigitN2 = n2 / 1000 % 10;

        for (int i = firstDigitN1; i <= firstDigitN2; i++) {

            for (int j = secondDigitN1; j <= secondDigitN2; j++) {

                for (int k = thirdDigitN1; k <= thirdDigitN2; k++) {

                    for (int l = fourthDigitN1; l <= fourthDigitN2; l++) {

                        if (i % 2 != 0 && j % 2 != 0 && k % 2 != 0 && l % 2 != 0) {
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }
                    }
                }
            }
        }
    }
}
