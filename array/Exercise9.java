package array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        // Importing class Scanner for input data user
        Scanner input = new Scanner(System.in);

        // Input size array
        int sizeArray = 0;
        System.out.println("What size of array: ");
        sizeArray = input.nextInt();

        // Arrays and variables
        Integer[] numbers = new Integer[sizeArray];

        // Iteration in array inserting data
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Element in array[%d]: ", i);
            numbers[i] = input.nextInt();
        }

        // Iteration in array for reversed elements
        for (int i = sizeArray - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }

        // Closing class Scanner
        input.close();
    }
}
