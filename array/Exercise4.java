package array;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        // Importing class Scanner for data user input
        Scanner input = new Scanner(System.in);

        // Creating variables and vector
        int[] numbers = new int[5];

        // Structure logical for calculate values
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Value of vector [%d] : ", i);
            numbers[i] = input.nextInt();
        }

        // Structure for Sorting values
        System.out.println("Values in order original: " + Arrays.toString(numbers));

        Arrays.sort(numbers);

        System.out.println("Values in order ascending: " + Arrays.toString(numbers));

        // Closing class Scanner
        input.close();
    }
}
