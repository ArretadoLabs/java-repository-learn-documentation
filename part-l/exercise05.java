import java.util.Scanner;

public class exercise05 {
    public static void main(String[] args) {
        // Importing class Scanner for input data user
        Scanner sc = new Scanner(System.in);

        // Section variables
        int numberOne;
        int numberTwo;

        // Input data user
        System.out.println("number one: ");
        numberOne = sc.nextInt();

        System.out.println("number two: ");
        numberTwo = sc.nextInt();

        // Printing value final
        System.out.println("Result: " + numberOne * numberTwo);

        // Closing class Scanner
        sc.close();

    }
}
