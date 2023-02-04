package PB.whileLoopExercise;

import java.util.Scanner;

public class ExamPreparationSecondVariant {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int poorGrade = Integer.parseInt(scanner.nextLine());
        String task = "";
        String grade = "";
        double sum = 0;
        int i = 0;
        int allGrades = 0;
        String lastProblem = "";
        int numberProblems = 0;

        while (true) {

            task = scanner.nextLine();

            if (task.equals("Enough")) {
                break;
            }

            grade = scanner.nextLine();

            int currentGrade = Integer.parseInt(grade);
            sum += currentGrade;

            if (currentGrade <= 4) {
                i++;
            }

            numberProblems++;
            allGrades++;

            if (i == poorGrade) {
                break;
            }

            lastProblem = task;
        }

        if (task.equals("Enough")) {
            System.out.printf("Average score: %.2f%n", sum / allGrades);
            System.out.printf("Number of problems: %d%n", numberProblems);
            System.out.printf("Last problem: %s", lastProblem);
        } else {
            System.out.printf("You need a break, %d poor grades.", i);
        }
    }
}
