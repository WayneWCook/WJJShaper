/* Lemniscate.java
Jakob Mook
10 April, 2020
This class creates a lemniscate, which extends the Circle class
 */
public class Lemniscate extends Shape {
    // Attributes
    private double radius;
    // Construct a single Circle to save radius and calculate areas.
    Lemniscate(double radius) {
        this.radius = radius;
    }
    // Shape forces this class to define these two methods with the exact signature.
    double getArea() {
        return (2 *(radius * radius * Math.PI));
    }
    double getPerimeter() {
        return (2 * (2 * radius * Math.PI));
    }
}
