import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        // Importing class Scanner input data user
        Scanner sc = new Scanner(System.in);

        // Variables
        String letter;

        // Input data user
        System.out.println("Letter: ");
        letter = sc.nextLine();

        // Logical structure conditional
        if (letter != "a" && letter != "e" && letter != "i" && letter != "o" && letter != "u") {
            System.out.println("Letter is consonant");
        } else {
            System.out.println("Letter is vowel");
        }

        // Closing class Scanner
        sc.close();

        /**
         * Code in development
         */
    }
}
