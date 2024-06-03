package array;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {

        // Importing class Scanner for data user input
        Scanner input = new Scanner(System.in);

        // Creating vector and variables
        int[] numbers = new int[5];
        int sum = 0;

        // Structure logical for input and calculate value
        for (int i = 0; i < 5; i++) {
            System.out.printf("Number of vector[%d] :", i);
            numbers[i] = input.nextInt();
        }

        for (int i : numbers) {
            sum += i;
        }
        System.out.println("Sum of values in vector is: " + sum);

        // Closing class Scanner
        input.close();

    }
}
