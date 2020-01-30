public class Circle {
    // Data fields

    private double radius = 1;  // Data field
    private static int numberOfObjects = 0;
    //---------------------------------------

    // Constructors
    /** Construct a circle object with default radius */
    Circle(){
        numberOfObjects++;
    }

    /** Construct a circle with defined radius */
    Circle(double newRadius){
        radius = newRadius;
        numberOfObjects++;
    }

    // ----------------------------------------

    // Methods

    /** Return the area of this circle */
    double getArea(){
        return radius * radius * Math.PI;
    }

    /** Return the perimeter of this circle */
    double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    /** Set new radius for the circle */
    void setRadius(double newRadius){
        radius = (newRadius >= 0) ? newRadius : 0;
    }

    double getRadius(){
        return  radius;
    }

    static int getNumberOfObjects(){
        return numberOfObjects;
    }
    // ----------------------------------------------
}
