package oop.test;

public class CircleTest {
    public float radius;

    // Constructor
    public CircleTest(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getArea() {
        return (float) Math.PI * radius * radius;
    }

    public float getPerimeter() {
        return 2 * (float) Math.PI * radius;
    }
}
