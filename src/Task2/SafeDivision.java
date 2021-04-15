package Task2;

import java.util.Scanner;

public class SafeDivision {
    public static void safeDivision() {
        double result;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A: ");
        int a = scanner.nextInt();
        System.out.print("Enter B: ");
        int b = scanner.nextInt();
        while (true) {
            try {
                if (b == 0) {
                    throw new ArithmeticException();
                }
                result = (double) a / b;
                break;
            } catch (ArithmeticException e) {
                System.out.println("The number B is zero.\nEnter a new number B");
                b = scanner.nextInt();
            }
        }
        System.out.println("Result: " + result);
    }
}
