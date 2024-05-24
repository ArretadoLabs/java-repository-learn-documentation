import java.util.Scanner;

public class exercise10 {
    public static void main(String[] args) {
        // Importing class Scanner for data user input
        Scanner sc = new Scanner(System.in);

        // Section of variables
        int a;
        int aux;
        int b;

        // input data user
        System.out.println("what value A: ");
        a = sc.nextInt();

        System.out.println("What value B: ");
        b = sc.nextInt();

        System.out.println("************ value before *************");
        System.out.println("Value A = " + a);
        System.out.println("Value B = " + b);

        // Structure logical operation
        aux = a;
        a = b;
        b = aux;

        // Printing value final
        System.out.println("************ value after *************");
        System.out.println("Value A = " + a);
        System.out.println("Value B = " + b);

        // Closing class Scanner
        sc.close();
    }
}
