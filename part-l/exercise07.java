import java.util.Scanner;

public class exercise07 {
    public static void main(String[] args) {
        // Importing class Scanner for input data user
        Scanner sc = new Scanner(System.in);

        // Section variables
        int number;

        // User data input user
        System.out.println("Number: ");
        number = sc.nextInt();

        // Structure logical operation
        for (int i = 0; i < 11; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        // Closing class Scanner
        sc.close();
    }
}
