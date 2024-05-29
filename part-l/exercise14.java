import java.util.Scanner;

public class exercise14 {
    public static void main(String[] args) {
        // Importing class Scanner for input data user
        Scanner sc = new Scanner(System.in);

        // variables
        int numberOne;

        // Input data user
        System.out.println("Number: ");
        numberOne = sc.nextInt();

        // Calling function
        System.out.println(sumDigits(numberOne));

        // closing class Scanner
        sc.close();
    }

    // Create function for calculate sum of numbers
    public static int sumDigits(int num) {
        int sum = 0;

        // Calculate sum of digits
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }
}
