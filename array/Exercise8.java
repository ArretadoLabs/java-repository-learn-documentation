package array;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        // Importing class Scanner for input user data
        Scanner input = new Scanner(System.in);

        // Vector and variables
        int sizeArray = 0;
        System.out.println("What array size with elements: ");
        sizeArray = input.nextInt();

        // Array for received value of you size
        int[] arraySize = new int[sizeArray];

        // Loop iteration for inserting data in array
        for (int i = 0; i < arraySize.length; i++) {
            System.out.printf("Element in vector index [%d]: ", i);
            arraySize[i] = input.nextInt();
        }

        // Printing size of array
        System.out.println("Size of array is: " + sizeArray);

        // Printing value in array
        for (int i : arraySize) {
            System.out.println(i);
        }

        // Closing class Scanner
        input.close();

    }
}
