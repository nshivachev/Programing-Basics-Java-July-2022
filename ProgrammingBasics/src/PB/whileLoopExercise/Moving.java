package PB.whileLoopExercise;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int room = width * length * height;
        String carton = scanner.nextLine();

        while (!carton.equals("Done") && room >= Integer.parseInt(carton)) {
            room -= Integer.parseInt(carton);
            carton = scanner.nextLine();
        }

        if (carton.equals("Done")) {
            System.out.printf("%d Cubic meters left.", room);
        } else {
            System.out.printf("No more free space! You need %d Cubic meters more.", Integer.parseInt(carton) - room);
        }
    }
}
