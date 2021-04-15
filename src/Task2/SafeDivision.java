package Task2;

import java.util.Scanner;

public class SafeDivision {
    public static void safeDivision() {
        int result;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A: ");
        int a = scanner.nextInt();
        System.out.print("Enter B: ");
        int b = scanner.nextInt();
        while (true) {
            try {
                result = a / b;
                break;
            } catch (ArithmeticException e) {
                System.out.println("The number B is zero.\nEnter a new number B");
                b = scanner.nextInt();
            }
        }
        System.out.println("Result: " + result);
    }
}
