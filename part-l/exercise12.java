import java.util.Scanner;

public class exercise12 {
    public static void main(String[] args) {
        // Importing class Scanner for data user input
        Scanner sc = new Scanner(System.in);

        // Section variables
        String name;

        // Input data user
        System.out.println("What string: ");
        name = sc.nextLine();
        char[] letters = name.toCharArray(); // creating vector

        // Logical structure
        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.println(letters[i]);
        }

        // Closing class Scanner
        sc.close();

    }
}
