package oop.domain;

import oop.test.CircleTest;

public class Circle {
    public static void main(String[] args) {
        float r = 5;
        CircleTest circleTest = new CircleTest(r);
        System.out.println("Radius of circle is: " + r);
        System.out.println("The area of circle is: " + circleTest.getArea());
        System.out.println("The perimeter of circle is: " + circleTest.getPerimeter());

        System.out.println("================== After ==================== ");
        r = 12;
        circleTest.setRadius(r);
        System.out.println("Radius of circle is: " + r);
        System.out.println("The area of circle is: " + circleTest.getArea());
        System.out.println("The perimeter of circle is: " + circleTest.getPerimeter());

    }
}
