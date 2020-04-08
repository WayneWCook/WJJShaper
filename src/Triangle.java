/* Rectangle.java
 * Joseph Jager
 * 25 March 2020
 * Create the Rectangle class based on the Shape class.
 */
//package Shape-RCC;

public class Triangle extends Shape{
    // Allow childred classes to access these two variables.
    protected double side1, side2, side3;
    // Methods
    Triangle(double mySide1, double mySide2, double mySide3 ) {
        side1 = mySide1;
        side2 = mySide2;
        side3 = mySide3;
    }
    double getArea() {
        // Using Heron's Formula
        double s = (side1+side2+side3)/2;
        return (Math.sqrt(s*(s-side1)*(s-side2)*(s-side3)));
    }
    double getPerimeter() {
        return (side1 + side2 + side3);
    }
}
