package org.example;



public class Shape {
    double perimeter;


    public double calculatePerimeter(double radius) {
        perimeter = (double) (2 * Math.PI * radius);
        return Math.round(perimeter);
    }

    // Method to calculate the perimeter of a rectangle
    public double calculatePerimeter(double length, double width) {
        perimeter = 2 * (length + width);
        return perimeter;
    }

    // Method to calculate the perimeter of a triangle
    public double calculatePerimeter(double side1, double side2, double side3) {
        perimeter = side1 + side2 + side3;
        return perimeter;
    }
}