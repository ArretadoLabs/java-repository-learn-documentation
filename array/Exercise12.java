package array;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        // Importing class Scanner for data user input
        Scanner input = new Scanner(System.in);

        // Indicate size of array
        System.out.println("What size of array: ");
        int sizeArray = input.nextInt();

        // Vector and variables
        int[] numbers = new int[sizeArray];

        // Loop iteration for inserting data array
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("What number in element position [%d]: ", i);
            numbers[i] = input.nextInt();
        }

        for (int i : numbers) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // Closing class Scanner
        input.close();

    }
}
