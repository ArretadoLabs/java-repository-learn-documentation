package oop;

import java.util.Scanner;

public class Area_Rectangle {
    public static void main(String[] args) {
        AreaOfRectangle areaRectangle = new AreaOfRectangle();

        areaRectangle.readBaseRectangle();
        areaRectangle.readHightRectangle();
        System.out.println("Area of rectangle is: " + areaRectangle.getAreaRectangle());
    }
}

class AreaOfRectangle {
    private float base = 0.0f;
    private float hight = 0.0f;
    private float areaRectangle = 0.0f;

    // Creating methods
    public void readBaseRectangle() {
        Scanner input = new Scanner(System.in);
        System.out.println("What value of base rectangle: ");
        base = input.nextFloat();

        input.close();
    }

    public void readHightRectangle() {
        Scanner input = new Scanner(System.in);
        System.out.println("What value of hight rectangle: ");
        hight = input.nextFloat();

        input.close();
    }

    public float getAreaRectangle() {
        areaRectangle = (float) (base * hight);

        return areaRectangle;
    }
}