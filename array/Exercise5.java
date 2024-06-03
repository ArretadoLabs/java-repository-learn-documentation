package array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        // Importing class Scanner for data user input
        Scanner input = new Scanner(System.in);

        // Creating vector of values
        Integer[] numbers = new Integer[5]; // For use class "Collections.reverseOrder()" of type Integer

        // Logical structure for inserting values in array
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Value of element array [%d]: " + i);
            numbers[i] = input.nextInt();
        }

        // Structure logical for sorting numbers
        System.out.println("List of values in order original: " + Arrays.toString(numbers));
        Arrays.sort(numbers, Collections.reverseOrder());

        // Closing class Scanner
        input.close();

    }
}
