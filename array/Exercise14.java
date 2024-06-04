package array;

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        // Importing class Scanner for input data user
        Scanner input = new Scanner(System.in);

        // Input size of array
        System.out.println("What size of array: ");
        int sizeArray = input.nextInt();

        // Creating array and variables
        int[] numbers = new int[sizeArray];
        int sumNumbersPair = 0;

        // Loop iteration for inserting data and vector
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Value in element array [%d]: ", i);
            numbers[i] = input.nextInt();
        }

        // iteration for identify value in element and sum only numbers pair/even
        for (int i : numbers) {
            if (i % 2 == 0) {
                sumNumbersPair += i;
            }
        }

        // Printing sum of numbers only pair/even
        System.out.println("Sum of values only pair is: " + sumNumbersPair);

        // Closing class Scanner
        input.close();

    }
}
