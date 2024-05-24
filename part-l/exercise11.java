import java.util.Scanner;

public class exercise11 {
    public static void main(String[] args) {
        // Importing class Scanner for data user input
        Scanner sc = new Scanner(System.in);

        // Section of variables
        int numberOne;
        int numberTwo;

        // Input data user
        System.out.println("number one: ");
        numberOne = sc.nextInt();

        System.out.println("number two: ");
        numberTwo = sc.nextInt();

        // Structure logical
        if (numberOne > numberTwo) {
            System.out.println("Number one is bigger");
        } else {
            System.out.println("Number one is smaller");
        }

        //Closing class Scanner
        sc.close();
    }
}