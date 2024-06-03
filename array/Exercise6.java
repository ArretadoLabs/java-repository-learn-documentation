package array;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        // Importing class Scanner for data user input
        Scanner input = new Scanner(System.in);

        // Creating vectors and variables
        int[] numbers = new int[5];
        int sum = 0; // initializer value in variable
        int averageNumbers = 0; // initializer value in variable

        // Inserting values in vector
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Value in element array [%d]: ", i);
            numbers[i] = input.nextInt();
        }
        for (int i : numbers) {
            sum += i;
        }

        // Calculating and printing average of numbers
        averageNumbers = sum / numbers.length;

        System.out.println("Average of numbers is: " + averageNumbers);

        // Closing class Scanner
        input.close();
    }
}
