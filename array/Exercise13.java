package array;

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        // Importing class scanner for input data user
        Scanner input = new Scanner(System.in);

        // Size of array
        System.out.println("What size of array: ");
        int sizeArray = input.nextInt();

        // Variables and vector
        int[] numbers = new int[sizeArray];
        int sumNumbersOdd = 0;

        // Loop for iteration and inserting data
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Value of element in position [%d]: ", i);
            numbers[i] = input.nextInt();
        }

        // Iteration loop for identify numbers odd and calculate sum values
        for (int i : numbers) {
            if (i % 2 == 1) {
                sumNumbersOdd += i;
            }
        }

        // Printing value final of sum numbers odd
        System.out.println("Sum of values odd in array is: " + sumNumbersOdd);

        // Closing class Scanner
        input.close();
    }
}
