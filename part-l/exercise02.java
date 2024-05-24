import java.util.Scanner;

public class exercise02 {
    public static void main(String[] args) {
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

        // printing value final
        System.out.println(numberOne + numberTwo);

        // Closing class Scanner
        sc.close();
    }
}
