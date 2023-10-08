package com.ikhsan.shapetest;

public class ShapeTest {
    public static void main(String[] args) {
        // Test Case Shape
        Shape shape1 = new Shape();
        System.out.println(shape1);

        Shape shape2 = new Shape("purple", false);
        System.out.println(shape2);

        // Testing Circle
        Circle circle1 = new Circle();
        System.out.println(circle1);

        Circle circle2 = new Circle(10.0);
        System.out.println(circle2);

        Circle circle3 = new Circle("yellow", true, 2.0);
        System.out.println(circle3);

        // Test Case Rectangle
        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1);

        Rectangle rectangle2 = new Rectangle(4.0, 6.0);
        System.out.println(rectangle2);

        Rectangle rectangle3 = new Rectangle("yellow", false, 4.0, 6.0);
        System.out.println(rectangle3);

        // Test Case Square
        Square square1 = new Square();
        System.out.println(square1);

        Square square2 = new Square(2.5);
        System.out.println(square2);

        Square square3 = new Square(4.0, true, "purple");
        System.out.println(square3);

        // Test Case setters dan getters
        circle1.setRadius(7.0);
        System.out.println("Radiusnya adalah: " + circle1.getRadius());

        rectangle1.setWidth(2.0);
        rectangle1.setLength(3.0);
        System.out.println("Lebarnya adalah: " + rectangle1.getWidth());
        System.out.println("Panjangnya adalah: " + rectangle1.getLength());

        square1.setSide(4.5);
        System.out.println("Sisinya adalah: " + square1.getSide());
    }
}
