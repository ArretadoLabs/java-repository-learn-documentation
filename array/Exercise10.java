package array;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        // Importing class Scanner for data user input
        Scanner input = new Scanner(System.in);

        // Input size of array
        int[] numbers = new int[5];

        // loop for iteration for input and inserting data in array
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("What number in element [%d]: ", i);
            numbers[i] = input.nextInt();
        }

        for (int i : numbers) {
            System.out.println(Math.pow(i, 3)); // Using class Math for operations math
        }

        // Closing class Scanner
        input.close();
    }
}
