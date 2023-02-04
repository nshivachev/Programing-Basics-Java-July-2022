package PB.nestedConditionsExercise;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hourExam = Integer.parseInt(scanner.nextLine());
        int minuteExam = Integer.parseInt(scanner.nextLine());
        int hourComing = Integer.parseInt(scanner.nextLine());
        int minuteComing = Integer.parseInt(scanner.nextLine());
        int timeExamInMinutes = hourExam * 60 + minuteExam;
        int timeComingInMinutes = hourComing * 60 + minuteComing;
        int difference = Math.abs(timeComingInMinutes - timeExamInMinutes);

        if (timeComingInMinutes > timeExamInMinutes ) {
            System.out.println("Late");
        } else if (timeComingInMinutes <= timeExamInMinutes && 30 >= timeExamInMinutes - timeComingInMinutes) {
            System.out.println("On time");
        } else {
            System.out.println("Early");
        }

        if (timeComingInMinutes - timeExamInMinutes != 0) {
            if (timeComingInMinutes < timeExamInMinutes && 60 > difference) {
                System.out.printf("%d minutes before the start", difference);
            } else if (timeComingInMinutes < timeExamInMinutes && 60 <= difference) {
                System.out.printf("%d:%02d hours before the start",difference / 60, difference % 60);
            } else if (timeComingInMinutes > timeExamInMinutes && 60 > difference) {
                System.out.printf("%d minutes after the start", difference);
            } else if (timeComingInMinutes > timeExamInMinutes && 60 <= difference) {
                System.out.printf("%d:%02d hours after the start", difference / 60, difference % 60);
            }
        }
    }
}
