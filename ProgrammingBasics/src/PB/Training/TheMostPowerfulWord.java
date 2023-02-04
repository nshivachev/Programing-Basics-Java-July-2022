package PB.Training;

import java.util.Scanner;

public class TheMostPowerfulWord {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        String mostPowerfulWord = "";
        double wordPower = 0;

        while (!word.equals("End of words")) {
            double currentWordPower = 0;
            for (int i = 0; i < word.length(); i++) {
                currentWordPower = currentWordPower + word.charAt(i);
            }

            String firstLetter = "" + word.charAt(0);

            if (firstLetter.equals("a") || firstLetter.equals("e") || firstLetter.equals("i") || firstLetter.equals("o")
                    || firstLetter.equals("u") || firstLetter.equals("y") || firstLetter.equals("A") || firstLetter.equals("E")
                    || firstLetter.equals("I") || firstLetter.equals("O") || firstLetter.equals("U") || firstLetter.equals("Y")) {
                currentWordPower = currentWordPower * word.length();
            } else {
                currentWordPower = Math.floor(currentWordPower / word.length());
            }

            if (currentWordPower > wordPower) {
                wordPower = currentWordPower;
                mostPowerfulWord = word;
            }

            word = scanner.nextLine();
        }

        System.out.printf("The most powerful word is %s - %.0f", mostPowerfulWord, wordPower);
    }
}
