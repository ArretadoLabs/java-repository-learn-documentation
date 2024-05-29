import java.util.Scanner;

public class exercise20 {
    public static void main(String[] args) {
        /**
         * Value logical if third number is equal a sum of two numbers
         */

        Scanner sc = new Scanner(System.in);

        // Variables
        int numberOne;
        int numberTwo;
        int numberThree;
        int sumNumbers;

        // input data user
        System.out.println("number one: ");
        numberOne = sc.nextInt();

        System.out.println("number two: ");
        numberTwo = sc.nextInt();

        System.out.println("number three: ");
        numberThree = sc.nextInt();

        // Sum of numbers
        sumNumbers = numberOne + numberTwo;

        // Creating structure logical
        if (numberThree == sumNumbers) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        // Closing class Scanner
        sc.close();
    }
}
