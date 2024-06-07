package oop.domain;

import oop.test.RectangleTest;

public class Rectangle {
    public static void main(String[] args) {
        RectangleTest rectangleTest = new RectangleTest(11, 12);
        System.out.println(rectangleTest.getArea());
        System.out.println(rectangleTest.getPerimeter());

    }
}
