package PB.nestedLoopsExercise;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int judgesNumber = Integer.parseInt(scanner.nextLine());
        String presentationName = scanner.nextLine();

        double allGradesSum = 0;
        int presentationsNumber = 0;

        while (!presentationName.equals("Finish")) {
            presentationsNumber++;
            double gradeSum = 0;
            for (int i = 1; i <= judgesNumber; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                gradeSum += grade;
            }

            double averageGrade = gradeSum / judgesNumber;
            allGradesSum += averageGrade;
            System.out.printf("%s - %.2f.%n", presentationName, averageGrade);
            presentationName = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", allGradesSum / presentationsNumber);
    }
}
