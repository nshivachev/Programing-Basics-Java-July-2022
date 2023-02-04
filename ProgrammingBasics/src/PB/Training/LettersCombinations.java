package PB.Training;

import java.util.Scanner;

public class LettersCombinations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String firstLetter = scanner.nextLine();
        String secondLetter = scanner.nextLine();
        String thirdLetter = scanner.nextLine();

        int startNum = firstLetter.charAt(0);
        int endNum = secondLetter.charAt(0);
        int missedNum = thirdLetter.charAt(0);

       int totalCombination = 0;

        for (int i = startNum; i <= endNum; i++) {

            for (int j = startNum; j <= endNum; j++) {

                for (int k = startNum; k <= endNum; k++) {

                    if (i != missedNum && j != missedNum && k != missedNum) {
                        System.out.printf("%c%c%c ", i,j,k);
                        totalCombination++;
                    }
                }
            }
        }
        System.out.print(totalCombination);
    }
}
