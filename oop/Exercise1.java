package oop;

import java.util.Scanner;

public class Exercise1 {

    String name;

    public void print_message() {
        Scanner input = new Scanner(System.in);
        System.out.println("What you message: ");
        name = input.nextLine();

        System.out.println("Message display is: " + name);

        // Closing class Scanner
        input.close();

    }

    public static void main(String[] args) {
        Exercise1 message = new Exercise1();
        message.print_message();
    }
}
