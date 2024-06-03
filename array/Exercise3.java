package array;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        // Importing class Scanner fot data user input
        Scanner sc = new Scanner(System.in);

        // variables
        int sum = 0;

        // Creating vector of type int
        int[] numbers = new int[10];

        for (int i = 0; i <= numbers.length; i++) {
            System.out.println("number: ");
            numbers[i] = sc.nextInt();
        }

        for (int i : numbers) {
            sum += numbers[i];
        }

        System.out.println("The sum of numbers is: " + sum);
    }
}
