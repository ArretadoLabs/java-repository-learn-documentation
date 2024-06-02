package array;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        // Importing class Scanner for data user input
        Scanner sc = new Scanner(System.in);

        // Creating vectors with data user input
        int[] array_number = new int[10];
        String[] array_string = new String[10];

        // Iteration for inserting numbers
        for (int i = 0; i < array_number.length; i++) {
            System.out.println("number: ");
            array_number[i] = sc.nextInt();
        }

        // Converting values and Sorting values in array
        Arrays.sort(array_number);
        System.out.println(Arrays.toString(array_number));

        for (int i = 0; i < array_string.length; i++) {
            System.out.println("String: ");
            array_string[i] = sc.nextLine();
        }

        Arrays.toString(array_string);
        System.out.println(Arrays.toString(array_string));

        // Closing class Scanner
        sc.close();

    }

}
