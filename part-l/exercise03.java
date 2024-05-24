import java.util.Scanner;

public class exercise03 {
    public static void main(String[] args) {
        /**
         * Write a Java program to divide two numbers and print them on the screen.
         * Test Data :
         * 50/3
         * Expected Output :
         * 16
         */

        // Importing class Scanner for input data user
        Scanner sc = new Scanner(System.in);

        // Section variables
        int numberOne;
        int numberTwo;

        // Input data user
        System.out.println("Number one: ");
        numberOne = sc.nextInt();

        System.out.println("Number two: ");
        numberTwo = sc.nextInt();

        // Printing value final
        System.out.println("Result final = " + numberOne / numberTwo);

        // Close class Scanner
        sc.close();

    }
}
