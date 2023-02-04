package PB.forLoopExercise;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());
        int fine = 0;

        for (int i = 1; i <= n; i++) {
            String webpage = scanner.nextLine();
            switch (webpage) {
                case "Facebook":
                    fine += 150;
                    break;
                case "Instagram":
                    fine += 100;
                    break;
                case "Reddit":
                    fine += 50;
                    break;
                default:
                    break;
            }
            if (salary - fine <= 0) {
                System.out.println("You have lost your salary.");
                return;
            }
        }

        System.out.println(salary - fine);
    }
}
