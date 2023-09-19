package org.example;

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Creating a new Shape object
        Shape shape = new Shape();

        // Getting the radius of the circle from the user
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextInt();

        // Getting the sides of the triangle from the user
        System.out.print("Please enter side one of the triangle: ");
        double side1 = scanner.nextInt();
        System.out.print("Please enter side two of the triangle: ");
        double side2 = scanner.nextInt();
        System.out.print("Please enter side three of the triangle: ");
        double side3 = scanner.nextInt();

        // Getting the length and width of the rectangle from the user
        System.out.print("Enter the length and width of the rectangle: ");
        double length = scanner.nextInt();
        System.out.print("Please enter the width of the rectangle: ");
        double width = scanner.nextInt();

        // Calculating and printing the perimeters
        System.out.println("Perimeter of the circle: " + shape.calculatePerimeter(radius) + " units");
        System.out.println("Perimeter of the triangle: " + shape.calculatePerimeter(side1, side2, side3) + " units");
        System.out.println("Perimeter of the rectangle: " + shape.calculatePerimeter(length, width) + " units");

        // Closing the scanner to prevent resource leak
        scanner.close();
    }
}


