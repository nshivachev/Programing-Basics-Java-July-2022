package PB.whileLoopLab;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String studentName = scanner.nextLine();
        int lowPoint = 0;
        int year = 1;
        double sum = 0;

        while (year <= 12) {

            if(lowPoint == 2) {
                break;
            }

            double point = Double.parseDouble(scanner.nextLine());

            if (point < 4) {
                lowPoint++;
                continue;
            }

            sum += point;

            year++;
        }

        if (lowPoint == 2) {
            System.out.printf("%s has been excluded at %d grade", studentName, year);
        } else {
            System.out.printf("%s graduated. Average grade: %.2f", studentName, sum / (year - 1));
        }
    }
}
