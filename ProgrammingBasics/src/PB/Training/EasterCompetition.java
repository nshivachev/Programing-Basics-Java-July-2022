package PB.Training;

import java.util.Scanner;

public class EasterCompetition {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int breadsCount = Integer.parseInt(scanner.nextLine());

        String winner = "";
        int maxGrade = Integer.MIN_VALUE;

        for (int i = 1; i <= breadsCount; i++) {
            String bakerName = scanner.nextLine();
            String grade = scanner.nextLine();
            int bakerGrade = 0;
            while (!grade.equals("Stop")) {
                int currentGrade = Integer.parseInt(grade);
                bakerGrade += currentGrade;
                grade = scanner.nextLine();
            }
            System.out.printf("%s has %d points.%n", bakerName, bakerGrade);

            if (bakerGrade > maxGrade) {
                maxGrade = bakerGrade;
                winner = bakerName;
                System.out.printf("%s is the new number 1!%n", winner);
            }
        }
        System.out.printf("%s won competition with %d points!", winner, maxGrade);
    }
}
