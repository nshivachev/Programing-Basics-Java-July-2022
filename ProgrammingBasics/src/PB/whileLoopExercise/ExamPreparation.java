package PB.whileLoopExercise;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int poorGrade = Integer.parseInt(scanner.nextLine());
        String task = scanner.nextLine();
        String grade = scanner.nextLine();
        double sum = 0;
        int i = 0;
        int allGrades = 0;
        String lastProblem = "";
        int numberProblems = 0;

        while (!task.equals("Enough")) {

            int currentGrade = Integer.parseInt(grade);
            sum += currentGrade;
            numberProblems++;
            allGrades++;
            lastProblem = task;

            if (currentGrade <= 4) {
                i++;
            }

            if (i == poorGrade) {
                break;
            }

            task = scanner.nextLine();

            if (task.equals("Enough")) {
                break;
            }

            grade = scanner.nextLine();
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
