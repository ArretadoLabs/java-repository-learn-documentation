import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Variables
        int numberOne, numberTwo, numberThree;

        // Input data user
        System.out.println("number one: ");
        numberOne = sc.nextInt();

        System.out.println("number two: ");
        numberTwo = sc.nextInt();

        System.out.println("number three: ");
        numberThree = sc.nextInt();

        // Logical structure for is bigger number
        if (numberOne > numberTwo && numberOne > numberThree) {
            System.out.println("Bigger number is: " + numberOne);
        } else if (numberTwo > numberThree) {
            System.out.println("Bigger number is: " + numberTwo);
        } else {
            System.out.println("Bigger numer is: " + numberThree);
        }

        // Closing class Scanner
        sc.close();
    }
}
