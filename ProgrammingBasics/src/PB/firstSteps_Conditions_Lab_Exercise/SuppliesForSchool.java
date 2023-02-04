package PB.firstSteps_Conditions_Lab_Exercise;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int cleaningWater = Integer.parseInt(scanner.nextLine());
        double discountPercent = Double.parseDouble(scanner.nextLine()) / 100;
        double sumNoDiscount = pens * 5.80 + markers * 7.20 + cleaningWater * 1.20;
        double sumDiscount = sumNoDiscount - sumNoDiscount * discountPercent;
        System.out.println(sumDiscount);
    }
}
