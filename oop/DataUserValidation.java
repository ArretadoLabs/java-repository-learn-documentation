package oop;

import java.util.Scanner;

public class DataUserValidation {
    public static void main(String[] args) {
        PeopleData peopleData = new PeopleData();

        peopleData.readName();
        peopleData.readCpf();
        peopleData.readAge();
        peopleData.readNumberPhone();

        // Printing all values
        peopleData.displayData();

    }
}

class PeopleData {
    private String name;
    private String cpf;
    private int age;
    private String numberPhone;

    // Section about methods
    public void readName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Your name is: ");
        name = input.nextLine();
        if (name.length() < 3) {
            System.out.println("name invalid, try again");
            System.out.println("Input your name: ");
            name = input.nextLine();
        }
    }

    public void readCpf() {
        Scanner input = new Scanner(System.in);
        System.out.println("Your CPF is: ");
        cpf = input.nextLine();
        if (cpf.length() != 11) {
            System.out.println("Data CPF is invalid, try again");
            System.out.println("You CPF: ");
            cpf = input.nextLine();
        }
    }

    public void readAge() {
        Scanner input = new Scanner(System.in);
        System.out.println("What you age, please: ");
        age = input.nextInt();
        if (age <= 0 || age > 150) {
            System.out.println("You age is invalid, try again");
            System.out.println("Your age please again: ");
            age = input.nextInt();
        }
    }

    public void readNumberPhone() {
        Scanner input = new Scanner(System.in);
        System.out.println("You cellphone: ");
        numberPhone = input.nextLine();
        if (numberPhone.length() != 11) {
            System.out.println("Size numbers is invalid, try again");
            System.out.println("Your number phone is: ");
            numberPhone = input.nextLine();
        }
    }

    public void displayData() {
        System.out.println(name);
        System.out.println(cpf);
        System.out.println(age);
        System.out.println(numberPhone);
    }

}