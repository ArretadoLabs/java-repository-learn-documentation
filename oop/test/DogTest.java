package oop.test;

public class DogTest {
    private String name;
    private String breed;

    // Creating constructor
    public DogTest(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    // Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
