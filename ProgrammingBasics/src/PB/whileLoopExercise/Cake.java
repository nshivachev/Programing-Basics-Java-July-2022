package PB.whileLoopExercise;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int cake = width * length;
        String slice = scanner.nextLine();

        while (!slice.equals("STOP") && cake >= Integer.parseInt(slice)) {
            cake -= Integer.parseInt(slice);
            slice = scanner.nextLine();
        }

        if (slice.equals("STOP")) {
            System.out.printf("%d pieces are left.", cake);
        } else {
            System.out.printf("No more cake left! You need %d pieces more.", Integer.parseInt(slice) - cake);
        }
    }
}
