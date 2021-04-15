import Task1.ExceptionA;
import Task1.ExceptionB;
import Task2.SafeDivision;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        //Task1
        System.out.println("*Task1*");
        try {
            throw new ExceptionA("exceptionA");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            throw new ExceptionB("exceptionB");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            throw new NullPointerException("NullPointerException");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            throw new IOException("IOException");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("-".repeat(30));

        //Task2
        System.out.println("*Task2*");
        SafeDivision.safeDivision();
        System.out.println("-".repeat(30));

        //Task3
        System.out.println("*Task3*");
        try {
            Task3.someMethod();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
