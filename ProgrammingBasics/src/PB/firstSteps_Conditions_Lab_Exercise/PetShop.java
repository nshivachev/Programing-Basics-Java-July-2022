package PB.firstSteps_Conditions_Lab_Exercise;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dogFoodNumber = Integer.parseInt(scanner.nextLine());
        int catFoodNumber = Integer.parseInt(scanner.nextLine());
        double sum = dogFoodNumber*2.5 + catFoodNumber*4;
        System.out.printf("%f lv.", sum);
    }
}
