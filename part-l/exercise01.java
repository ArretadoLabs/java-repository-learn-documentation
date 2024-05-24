import java.util.Scanner;

public class exercise01 {
    public static void main(String[] args) {

        //Importing class Scanner for input data 
        Scanner sc = new Scanner(System.in);

        //Section variables
        String name;

        //Input data user
        System.out.println("Input a name: ");
        name = sc.nextLine();

        // Printing result final
        System.out.println("Hello \n" + name);

        // Closing class Scanner
        sc.close();

    }
}