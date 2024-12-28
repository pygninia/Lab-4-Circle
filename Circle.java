/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sarno_joelrazzle_circle;

/**
 *
 * @author Billey
 */
public class Circle {
    // Private attribute for radius

    private double radius;

    // Default constructor (sets radius to 1.0)
    public Circle() {
        this.radius = 1.0;
    }

    // Parameterized constructor (sets radius to the given value)
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter method to return the radius
    public double getRadius() {
        return radius;
    }

    // Setter method to set a new value for the radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public double getArea() {
        return Math.PI * radius * radius;  // Area = π * r^2
    }

    // Method to calculate the circumference of the circle
    public double getCircumference() {
        return 2 * Math.PI * radius;  // Circumference = 2 * π * r
    }

    // Method to calculate the diameter of the circle
    public double getDiameter() {
        return 2 * radius;  // Diameter = 2 * r
    }
}
