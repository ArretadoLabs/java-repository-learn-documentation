import java.util.Scanner;

public class exercise15 {
    public static void main(String[] args) {
        // Importing class Scanner for data user input
        Scanner sc = new Scanner(System.in);

        // Creating vector empty
        char[] letters;

        // input data user
        System.out.println("What a work: ");
        letters = sc.nextLine().toCharArray();

        // Structure logical for reverse
        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.println(letters[i]);
        }

        System.out.println("\n");

        // closing class Scanner
        sc.close();
    }
}
