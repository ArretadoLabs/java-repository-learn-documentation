package oop.domain;

import oop.test.DogTest;

public class Dog {
    public static void main(String[] args) {
        DogTest dogTest = new DogTest("apolo", "Fox Paulistinha");

        // Before
        System.out.println(dogTest.getName() + " And " + dogTest.getBreed());

        // After
        dogTest.setName("Pandora");
        dogTest.setBreed("Golden Retriever");

        System.out.println(dogTest.getName() + " And " + dogTest.getBreed());
    }
}
