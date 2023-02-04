package PB.Training;

import java.util.Scanner;

public class Renovation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int height = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int noPaintPercent = Integer.parseInt(scanner.nextLine());
        double area = Math.ceil ((width * height * 4.0) - (width * height * 4.0) * (noPaintPercent * 1.0 / 100));
        int paintedArea = 0;
        String paint = scanner.nextLine();

        while (!paint.equals("Tired!")) {
            int currentPaint = Integer.parseInt(paint);
            paintedArea += currentPaint;

            if (paintedArea >= area) {
                break;
            }

            paint = scanner.nextLine();
        }

        double diff = Math.abs(area - paintedArea);

        if (paint.equals("Tired!")) {
            System.out.printf("%.0f quadratic m left.", diff);
        } else if (paintedArea > area) {
            System.out.printf("All walls are painted and you have %.0f l paint left!", diff);
        } else {
            System.out.println("All walls are painted! Great job, Pesho!");
        }
    }
}
