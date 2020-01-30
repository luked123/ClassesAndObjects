/** A class representing a rectangle */
public class Rectangle {
    /** Private data fields */
    private double width = 1;
    private double height = 1;

    /** Default constructor */
    public Rectangle(){
    }

    /** Rectangle with specified width and height */
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    /** Returns the width of the rectangle */
    public double getWidth(){
        return this.width;
    }

    /** Returns the height of the rectangle */
    public double getHeight(){
        return this.height;
    }

    /** Sets the width of the rectangle */
    public void setWidth(double width){
        this.width = width;
    }

    /** Sets the height of the rectangle */
    public void setHeight(double height){
        this.height = height;
    }

    /** Returns the area of the rectangle */
    public double getArea(){
        return this.width * this.height;
    }

    /** Returns the perimeter of the rectangle */
    public double getPerimeter(){
        return (2 * this.width) + (2 * this.height);
    }
}
