import java.util.Scanner;

public class exercise16 {
    public static void main(String[] args) {
        // Importing class Scanner
        Scanner sc = new Scanner(System.in);

        // Variables
        String name;

        // Input data user
        System.out.println("Input you works");
        name = sc.nextLine();
        
        //Calling function for operation
        count(name);

        //Closing class Scanner
        sc.close();

    }

    // Creating structure logical of function
    public static void count(String work) {
        char[] name = work.toCharArray(); // Converting String in array character

        // Initializing counters for letters, spaces, numbers
        int letters = 0;
        int space = 0;
        int num = 0;
        int others = 0;

        for (int i = 0; i < work.length(); i++) {
            if (Character.isLetter(name[i])) {
                letters++;
            }
            else if (Character.isDigit(name[i])) {
                num++;                
            }
            else if (Character.isSpaceChar(name[i])){
                space++;
            } else {
                others++;
            }
        }

        System.out.println("amount Letters is -> " + letters);
        System.out.println("amount space is -> " + space);
        System.out.println("amount num is -> " + num);
        System.out.println("amount others is -> " + others);
    }

}
