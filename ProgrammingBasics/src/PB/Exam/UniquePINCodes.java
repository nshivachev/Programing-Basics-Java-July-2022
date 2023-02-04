package PB.Exam;

import java.util.Scanner;

public class UniquePINCodes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n1; i++) {
            if (i % 2 != 0) {
                continue;
            }
            for (int j = 1; j <= n2; j++) {
                boolean isNonPrimeNum = false;
                for (int l = 2; l < j; l++) {
                    if (j % l == 0) {
                        isNonPrimeNum = true;
                        break;
                    }
                }
                if (j < 2 || j > 7 || isNonPrimeNum) {
                    continue;
                }
                for (int k = 1; k <= n3; k++) {
                    if (k % 2 == 0) {
                        System.out.printf("%d %d %d%n", i, j, k);
                    }
                }
            }
        }
    }
}
