import java.util.Scanner;

public class exercise09 {
    public static void main(String[] args) {
        // Importing class Scanner for data user input
        Scanner sc = new Scanner(System.in);

        // Section variables
        double width;
        double height;

        // Input data user
        System.out.println("Width: ");
        width = sc.nextDouble();

        System.out.println("height: ");
        height = sc.nextDouble();

        // Calculating operation logical
        System.out.println("The area of rectangle is: " + (width * height));
        System.out.println("The perimeter of rectangle is: " + (2 * (width + height)));

        // Closing class Scanner
        sc.close();

    }
}
