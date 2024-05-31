import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        // Importing class Scanner for input data user
        Scanner sc = new Scanner(System.in);

        // variables
        int numberMonth, numberYear;

        // Input data user
        System.out.println("Input a number of month: ");
        numberMonth = sc.nextInt();

        System.out.println("Input a number of year: ");
        numberYear = sc.nextInt();

        // Structure logical conditional
        if (numberMonth == 2) {
            System.out.println("28 days");
            System.out.println(numberYear);
        } else if (numberMonth == 4 || numberMonth == 6 || numberMonth == 10) {
            System.out.println("30 days");
            System.out.println(numberYear);
        } else {
            System.out.println("31 days");
            System.out.println(numberYear);
        }

        // Closing class Scanner
        sc.close();
    }
}
