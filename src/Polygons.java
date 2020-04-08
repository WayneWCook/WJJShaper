/* Polygons.java
 * William Deeds
 * 25 March 2020
 * Create the Pentagon class based on the Shape class.
 */
//package Shape-RCC; 
public class Polygons extends Shape {
    // Allow childred classes to access these two variables. 
    protected double side;
    protected int numSides;
    //Methods
    Polygons(double side, int numSides) {
        this.side = side;
        this.numSides = numSides;
    }
    double getArea() {
        double a = side / (2*(Math.tan(Math.PI / numSides)));
        return (numSides*side *a / 2);
    }
    double getPerimeter() {
        return (numSides*side );
    }
} 
 