import java.util.Scanner;

public class exercuse19 {
    public static void main(String[] args) {
        /**
         * Printing number 1 if number is even or 0 if odd
         */
        Scanner sc = new Scanner(System.in);

        // variables
        int number;

        System.out.println("number: ");
        number = sc.nextInt();

        // Structure logical for identify number
        if (number % 2 == 1) {
            System.out.println("Number is odd");
        } else {
            System.out.println("Number is even");
        }

        // Closing class Scanner
        sc.close();
    }
}
