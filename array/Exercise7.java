package array;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        // Importing class Scanner for data user input
        Scanner input = new Scanner(System.in);

        // Creating arrays and variables
        int[] numbers = new int[5];

        // Loop for iteration and input numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Value of element array [%d]: ", i);
            numbers[i] = input.nextInt();
        }

        // Display numbers in vector
        for (int i : numbers) {
            System.out.println(i);
        }

        // Closing class Scanner
        input.close();

    }
}
