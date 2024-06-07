package oop.test;

public class RectangleTest {
    private float width;
    private float height;

    public RectangleTest(float width, float height) {
        this.width = width;
        this.height = height;
    }

    // Getters and Setters
    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getArea(){
        return width * height;
    }

    public float getPerimeter(){
        return 2 * (width * height);
    }

}
