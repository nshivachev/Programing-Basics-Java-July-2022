package PB.firstSteps_Conditions_Lab_Exercise;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double meters = Double.parseDouble(scanner.nextLine());
        double fullPrice = meters * 7.61;
        double discount = fullPrice*0.18;
        double discountedPrice = fullPrice-discount;
        System.out.printf("The final price is: %.2f lv.%n", discountedPrice);
        System.out.printf("The discount is: %.2f lv.", discount);
    }
}
