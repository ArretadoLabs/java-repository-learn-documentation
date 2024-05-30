import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        // Importing class Scanner for input data user
        Scanner sc = new Scanner(System.in);

        // Variables
        int numberDay;

        // Input data user
        System.out.println("input a number: ");
        numberDay = sc.nextInt();

        // Structure logical conditional
        if (numberDay == 0) {
            System.out.println("Sunday");
        } else if (numberDay == 1) {
            System.out.println("Monday");
        } else if (numberDay == 2) {
            System.out.println("Tuesday");
        } else if (numberDay == 3) {
            System.out.println("Wednesday");
        } else if (numberDay == 4) {
            System.out.println("Thursday");
        } else if (numberDay == 5) {
            System.out.println("Friday");
        } else if (numberDay == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Day input invalid");
        }

        // Closing class Scanner
        sc.close();
    }
}
