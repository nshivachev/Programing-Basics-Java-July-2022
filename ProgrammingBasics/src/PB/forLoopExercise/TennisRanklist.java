package PB.forLoopExercise;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int tournaments = Integer.parseInt(scanner.nextLine());
        int startPoints = Integer.parseInt(scanner.nextLine());
        int finalPoints = startPoints;
        int w = 0;

        for (int i = 1; i <= tournaments; i++) {
            String stage = scanner.nextLine();
            switch (stage) {
                case "W":
                    finalPoints += 2000;
                    w++;
                    break;
                case "F":
                    finalPoints += 1200;
                    break;
                case "SF":
                    finalPoints += 720;
                    break;
                default:
                    break;
            }
        }
        System.out.println("Final points: " + finalPoints);
        System.out.printf("Average points: %.0f%n%.2f%%", Math.floor((finalPoints * 1.0 - startPoints) / tournaments), w * 1.0 / tournaments * 100);
    }
}
