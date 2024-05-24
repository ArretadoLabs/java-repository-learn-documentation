import java.util.Scanner;

public class exercise08 {
    public static void main(String[] args) {
        //Importing class Scanner for input data user
        Scanner sc = new Scanner(System.in);

        //Section of variables
        int numberOne;
        int numberTwo;
        int numberThree;
        int averageNumbers;

        //Input data user
        System.out.println("Number one: ");
        numberOne = sc.nextInt();

        System.out.println("Number two: ");
        numberTwo = sc.nextInt();

        System.out.println("Number three: ");
        numberThree = sc.nextInt();
        
        //Result final of average three numbers
        averageNumbers = (numberOne + numberTwo + numberThree) / 3;

        //Printing value final of average
        System.out.println("Result final of average: " + averageNumbers);

        //Closing class Scanner
        sc.close();
    }
}
