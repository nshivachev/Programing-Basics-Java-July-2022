package PB.forLoopExercise;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int groups = Integer.parseInt(scanner.nextLine());
        int musala = 0;
        int montblanc = 0;
        int kilimanjaro = 0;
        int k2 = 0;
        int everest = 0;
        
        for (int i = 1; i <= groups; i++) {
            int persons = Integer.parseInt(scanner.nextLine());
            if (persons <= 5) {
                musala += persons;
            } else if (persons <= 12) {
                montblanc += persons;
            } else if (persons <= 25) {
                kilimanjaro += persons;
            } else if (persons <= 40) {
                k2 += persons;
            } else if (persons >= 41) {
                everest += persons;
            }
        }

        int sum = musala + montblanc + kilimanjaro + k2 + everest;

        System.out.printf("%.2f%%%n", ((musala * 1.0) / sum) * 100);
        System.out.printf("%.2f%%%n", ((montblanc * 1.0) / sum) * 100);
        System.out.printf("%.2f%%%n", ((kilimanjaro * 1.0) / sum) * 100);
        System.out.printf("%.2f%%%n", ((k2 * 1.0) / sum) * 100);
        System.out.printf("%.2f%%%n", ((everest * 1.0) / sum) * 100);
        

        
    }
}
