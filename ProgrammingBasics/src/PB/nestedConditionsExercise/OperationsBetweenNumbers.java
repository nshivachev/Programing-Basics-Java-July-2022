package PB.nestedConditionsExercise;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        double result = 0;
        boolean isZero  = (n2==0) ? true : false;

        switch (operator) {
            case "+":
                result = n1 + n2;
                break;
            case "-":
                result = n1 - n2;
               break;
            case "*":
                result = n1 * n2;
                break;
            case "/":
                if (!isZero)
                    result = n1 * 1.0 / n2;
                else
                    System.out.printf("Cannot divide %d by zero", n1);
                break;
            case "%":
                if (!isZero)
                    result = n1 % n2;
                else
                    System.out.printf("Cannot divide %d by zero", n1);
                break;
            default:
                break;
        }

        if (operator.equals("+") || operator.equals("-") || operator.equals("*")) {
            String evenOrOdd = (result % 2 == 0) ? "even" : "odd";
            System.out.printf("%d %s %d = %.0f - %s", n1, operator, n2, result, evenOrOdd);
        } else if (operator.equals("/") && !isZero) {
            System.out.printf("%d %s %d = %.2f", n1, operator, n2, result);                
        } else if (operator.equals("%") && !isZero) {
            System.out.printf("%d %s %d = %.0f", n1, operator, n2, result);
        }
    }
}
