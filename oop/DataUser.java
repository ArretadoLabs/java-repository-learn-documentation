package oop;

import java.util.Arrays;
import java.util.Scanner;

public class DataUser {
    public static void main(String[] args) {

        People people = new People();
        people.ReadName();
        people.ReadCPF();
        people.ReadAge();
        people.DisplayData();

    }
}

// Class People
class People {

    // Attributes
    private String name;
    private String cpf;
    private int age;

    // Creating methods
    public void ReadName() {
        Scanner input = new Scanner(System.in);
        System.out.println("What your name: ");
        name = input.nextLine();

    }

    public void ReadCPF() {
        Scanner input = new Scanner(System.in);
        System.out.println("What your CPF: ");
        cpf = input.nextLine();

    }

    public void ReadAge() {
        Scanner input = new Scanner(System.in);
        System.out.println("What you age: ");
        age = input.nextInt();

    }

    public void DisplayData() {
        System.out.println(name);
        System.out.println(cpf);
        System.out.println(age);
    }

}