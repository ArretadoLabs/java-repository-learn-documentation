package oop.domain;

import java.util.Scanner;

import oop.test.Person;

public class PersonOpp {
    public static void main(String[] args) {
        Person person = new Person("Francisco Gomes", 29);

        System.out.println(person.getName() + " is " + person.getAge() + " Years old");
    }
}
