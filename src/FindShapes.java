/* FindShapes.java
 * Wayne Cook
 * 25 March 2020
 * Create the main class to test the rectangle, swuare, circle and shombus classes.
 * Force a commit
 * 2010 April 14: Added constructor and destructor to Shape class to tract number of open Shape classes.
 */
//package Shape-RCC;

import javax.security.sasl.RealmCallback;
import java.awt.*;

public class FindShapes {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(15,10);
        System.out.println("There are now " + rec1.getcount() + " shapes");
        Square square = new Square(7);
        System.out.println("There are now " + square.getcount() + " shapes");
        Circle circle = new Circle(3);
        System.out.println("There are now " + circle.getcount() + " sapess");
        Rhombus rhombus = new Rhombus(5, 0.5);
        System.out.println("There are now " + rec1.getcount() + " shapess");
        Polygons pentagon = new Polygons(6,5);
        System.out.println("There are now " + rec1.getcount() + " shapess");
        Polygons octagon = new Polygons(10,8);
        System.out.println("There are now " + rec1.getcount() + " shapess");
        Triangle triangle = new Triangle(6,7,4);
        System.out.println("There are now " + rec1.getcount() + " shapess");
        Lemniscate lemniscate = new Lemniscate(3);
        System.out.println("Rectable are is: " + rec1.getArea());
        System.out.println("Square area is: "+ square.getArea());
        System.out.println("The sum can go in either direction!");
        System.out.println("The sum of the rectangel and square areas is: " + rec1.addArea(square));
        System.out.println("The sum of the square and rectangle areas is: " + square.addArea(rec1));
        System.out.println("The Circlwe area is: " + circle.getArea());
        System.out.println("The Rhombus area is: " + rhombus.getArea());
        System.out.println("The Lemniscate's area is: " + lemniscate.getArea());
        System.out.println("The circle and retangle areas add to: " + circle.addArea(rec1));
        System.out.println("The Rhombus and Square areas add to: " + rhombus.addArea(square));
        System.out.println("The Rhombus and Cifcle areas add to: " + rhombus.addArea(circle));
        System.out.println("The area of the pentagon is: " + pentagon.getArea());
        System.out.println("The area of the octagon is: " + octagon.getArea());
        System.out.println("The sum of the pentagon and the octagon is: " + pentagon.addArea(octagon));
        System.out.println("The area of the Triangle is: " + triangle.getArea());
        System.out.println("The Triangle and Rhombus areas add to: " + triangle.addArea(rhombus));
        System.out.println("The Lemniscate and Rectangle's area adds to: " + lemniscate.addArea(rec1));
        // Now start the process of removing the objects from heap memory.
        System.out.println(" The end has come. There are now " + lemniscate.getcount() + " shape<");
        square.decCount();
        square = null;                          // Allow  JAVA to garbarge collect detroyed instance.
        System.out.println("There are now " + lemniscate.getcount() + " shapes");
        circle.decCount();
        circle = null;                          // Allow  JAVA to garbarge collect detroyed instance.
        System.out.println("There are now " + lemniscate.getcount() + " shapes");
        rec1.decCount();
        rec1 = null;                          // Allow  JAVA to garbarge collect detroyed instance.
        System.out.println("There are now " + lemniscate.getcount() + " shapes");
        pentagon.decCount();
        square = null;                          // Allow  JAVA to garbarge collect detroyed instance.
        System.out.println("There are now " + lemniscate.getcount() + " shapes");
        rhombus.decCount();
        rhombus = null;                          // Allow  JAVA to garbarge collect detroyed instance.
        System.out.println("There are now " + lemniscate.getcount() + " shapes");
        octagon.decCount();
        octagon = null;                          // Allow  JAVA to garbarge collect detroyed instance.
        System.out.println("There are now " + lemniscate.getcount() + " shapes");
        triangle.decCount();
        triangle = null;                          // Allow  JAVA to garbarge collect detroyed instance.
        System.out.println("There are now " + lemniscate.getcount() + " shapes");
        lemniscate.decCount();
        lemniscate = null;                          // Allow  JAVA to garbarge collect detroyed instance.
        try {
            System.out.println("There are now " + triangle.getcount() + " shape<");
            triangle.decCount();
            triangle = null;                          // Allow  JAVA to garbarge collect detroyed instance.
        } catch (Exception e) {
            System.out.println("Second destruction of triangle did not work. Already destroyed.");
        }
    }

}

