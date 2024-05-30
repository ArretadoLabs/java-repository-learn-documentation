import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        // Importing class Scanner for data user input
        Scanner sc = new Scanner(System.in);

        // Variables
        int numberOne;

        // Input data user
        System.out.println("Number: ");
        numberOne = sc.nextInt();

        // Structure logical
        if (numberOne >= 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is negative");
        }

        // Closing class Scanner
        sc.close();

    }
}
