import java.util.Scanner;

public class exercise13 {
    public static void main(String[] args) {
        /**
         * Importing class Scanner for input data user
         */
        Scanner sc = new Scanner(System.in);

        // Variables
        int numberOne;
        int numberTwo;

        // Input data user
        System.out.println("Number one: ");
        numberOne = sc.nextInt();

        System.out.println("Number two: ");
        numberTwo = sc.nextInt();

        // Structure logical for compare two numbers
        if (numberOne > numberTwo) {
            System.out.println(numberOne + " > " + numberTwo);
        } else if (numberOne < numberTwo) {
            System.out.println(numberOne + " < " + numberTwo);
        } else {
            System.out.println("Two numbers is equal " + numberOne + " = " + numberTwo);
        }

        // closing class Scanner
        sc.close();

    }
}
