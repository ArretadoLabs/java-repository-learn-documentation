package oop;

public class Exercise2 {

    public static void main(String[] args) {
        Sample[] arrayObj = new Sample[10];
        arrayObj[0] = new Sample();
        arrayObj[1] = new Sample();
        arrayObj[2] = new Sample();
        arrayObj[3] = new Sample();
        arrayObj[4] = new Sample();

        // Calling instancing object method "sayHello()"
        arrayObj[0].sayHello();
        arrayObj[1].sayHello();
        arrayObj[2].sayHello();
        arrayObj[3].sayHello();

        // Calling instancing object method "sayName()"
        arrayObj[4].sayName();
    }
}

// Creating class
class Sample {
    void sayHello() {
        System.out.println("Hello Java");
    }

    void sayName() {
        System.out.println("My name is Francisco.");
    }
}
