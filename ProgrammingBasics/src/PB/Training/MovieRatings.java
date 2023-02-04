package PB.Training;

import java.util.Scanner;

public class MovieRatings {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        double minNum = Double.MAX_VALUE;
        double maxNum = Double.MIN_VALUE;
        double sum = 0;
        String titleMinRating = "";
        String titleMaxRating = "";

        for (int i = 1; i <= count; i++) {
            String title = scanner.nextLine();
            double rating = Double.parseDouble(scanner.nextLine());
            if (rating < minNum) {
                minNum = rating;
                titleMinRating = title;
            }
            if (rating > maxNum){
                maxNum = rating;
                titleMaxRating = title;
            }

            sum += rating;
        }

        System.out.printf("%s is with highest rating: %.1f%n", titleMaxRating, maxNum);
        System.out.printf("%s is with lowest rating: %.1f%n", titleMinRating, minNum);
        System.out.printf("Average rating: %.1f", sum / count);
    }
}
