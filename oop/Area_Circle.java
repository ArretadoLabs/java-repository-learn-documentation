package oop;

import java.util.Scanner;

public class Area_Circle {
    public static void main(String[] args) {
        // Instancing object
        AreaCircle areaCircle = new AreaCircle();
        areaCircle.readRadius();
        System.out.println("Area of circle is: " + areaCircle.getAreaCircle());

    }
}

// Creating class for calculate area circle
class AreaCircle {
    // Attributes of class
    private float radius = 0.0f;
    private float area = 0.0f;

    // Creating method for calculate area
    public void readRadius() {
        Scanner input = new Scanner(System.in);
        System.out.println("What value of radius: ");
        radius = input.nextFloat();

        input.close();
    }

    public float getAreaCircle() {
        area = (float) Math.PI * radius * radius;

        return area;
    }

}
