package array;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        // Importing class Scanner for data user input
        Scanner sc = new Scanner(System.in);

        // Creating vectors
        int[] array_int = new int[10];
        String[] array_string = new String[10];

        // Creating structure repetition for inserting data
        for (int i = 0; i < array_int.length; i++) {
            System.out.println("number: ");
            array_int[i] = sc.nextInt();
        }

        // Printing values in array
        for (int i : array_int) {
            System.out.print(i);
        }

        // Creating structure for inserting data of type String
        for (int i = 0; i < array_string.length; i++) {
            System.out.println("\n What String: ");
            array_string[i] = sc.nextLine();
        }

        // Printing values in array String
        for (String i : array_string) {
            System.out.print(i);
        }

        // Closing class Scanner
        sc.close();

    }
}
