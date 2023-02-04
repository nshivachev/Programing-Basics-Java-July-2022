package PB.firstSteps_Conditions_Lab_Exercise;

import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int projectNumbers = Integer.parseInt(scanner.nextLine());
        int hours = projectNumbers*3;
        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, hours, projectNumbers);
    }
}
