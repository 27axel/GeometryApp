package com.example.geometryapp;

import com.example.geometry.Circle;
import com.example.geometry.Rectangle;
import com.example.geometry.Triangle;
import com.example.geometryutils.Utils;

public class App {
    public static void main( String[] args ) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(5, 5);
        Triangle triangle = new Triangle(3,4,5);

        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Circle perimeter: " + circle.getPerimeter());

        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());

        System.out.println("Triangle area: " + triangle.getArea());
        System.out.println("Triangle perimeter: " + triangle.getPerimeter());

        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(5);

        System.out.println("Circle1 area: " + circle1.getArea());
        System.out.println("Circle2 area: " + circle2.getArea());

        boolean areEqual = Utils.compareAreas(circle1, circle2);
        System.out.println("Are the circles equal in area? " + areEqual);
    }
}
