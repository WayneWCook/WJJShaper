/* FindShapes.java
 * Wayne Cook
 * 25 March 2020
 * Create the Circle class that inherits from the abstract class Shape
 * Is this the base for the oval, or does an oval need to directly inherit from Shape?
 */
//package Shape-RCC;

public class Circle extends Shape {
    // Attributes
    private double radius;
    // Construct a Circle to save radius and calculate areas.
    Circle(double radius) {
        this.radius = radius;
    }
    // Shape forces this class to define these two methods with the exact signiture.
    // Correctly calculate area dnd parimeter of a circle.
    public double getArea() {
        return (radius * radius * Math.PI);
    }
    public double getPerimeter() {
        return (2 * radius * Math.PI);
    }
}
