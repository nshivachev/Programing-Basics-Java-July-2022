package PB.Training;

import java.util.Scanner;

public class EasterEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        int red = 0;
        int orange = 0;
        int blue = 0;
        int green = 0;
        int max = Integer.MIN_VALUE;
        String maxColor = "";

        for (int i = 1; i <= count; i++) {
            String color = scanner.nextLine();
            switch (color) {
                case "red":
                    red++;
                    if (red > max) {
                        max = red;
                        maxColor = color;
                    }
                    break;
                case "orange":
                    orange++;
                    if (orange > max) {
                        max = orange;
                        maxColor = color;
                    }
                    break;
                case "blue":
                    blue++;
                    if (blue > max) {
                        max = blue;
                        maxColor = color;
                    }
                    break;
                case "green":
                    green++;
                    if (green > max) {
                        max = green;
                        maxColor = color;
                    }
                default:
                    break;
            }
        }

        System.out.println("Red eggs: " + red);
        System.out.println("Orange eggs: " + orange);
        System.out.println("Blue eggs: " + blue);
        System.out.println("Green eggs: " + green);
        System.out.printf("Max eggs: %d -> %s", max, maxColor);

    }
}
