package array;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {

        // Creating vector and variables
        int[] numbers = new int[5];
        int sum = 0;

        // Structure logical for input and calculate value
        for (int i = 0; i < 5; i++) {
            Scanner input = new Scanner(System.in);
            System.out.printf("Number of vector[%d] :", i);
            numbers[i] = input.nextInt();
        }

        for (int i : numbers) {
            sum += i;
        }
        System.out.println("Sum of values in vector is: " + sum);

    }
}
