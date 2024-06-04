package array;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        // Importing class Scanner for input data user
        Scanner input = new Scanner(System.in);

        System.out.println("What size of array: ");
        int sizeArray = input.nextInt();

        // Array and variables
        int[] numbers = new int[sizeArray];

        // Loop iteration for inserting and manipulate array
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Element in array [%d]: ", i);
            numbers[i] = input.nextInt();
        }

        // Iteration in array for display numbers odd
        for (int i : numbers) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }

        // Closing class Scanner
        input.close();
    }
}
