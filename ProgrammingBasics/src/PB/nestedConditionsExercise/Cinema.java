package PB.nestedConditionsExercise;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());
        double singlePrice = 0;

        if (projection.equals("Premiere")) {
            singlePrice = 12.00;
        } else if (projection.equals("Normal")) {
            singlePrice = 7.50;            
        } else if (projection.equals("Discount")) {
            singlePrice = 5.00;
        }

        System.out.printf("%.2f leva", rows * columns * singlePrice);
    }
}
