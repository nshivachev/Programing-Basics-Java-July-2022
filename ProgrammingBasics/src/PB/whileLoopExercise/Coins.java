package PB.whileLoopExercise;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double change = Double.parseDouble(scanner.nextLine());
        change = change * 100;
        int counter = 0;

        while (change >= 1) {

            if (change < 2) {
                change--;
                counter++;
            } else if (change < 5) {
                change -= 2;
                counter++;
            } else if (change < 10) {
                change -= 5;
                counter++;
            } else if (change < 20) {
                change -= 10;
                counter++;
            } else if (change < 50) {
                change -= 20;
                counter++;
            } else if (change < 100) {
                change -= 50;
                counter++;
            } else if (change < 200) {
                change -= 100;
                counter++;
            } else if (change >= 200) {
                change -= 200;
                counter++;
            }
        }
        System.out.println(counter);
    }
}
