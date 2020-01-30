public class TestSimpleCircle {
    private boolean x = true;
    /** Main method */
    public static void main(String[] args){
        // Create circle with radius 1
        Circle circle1 = new Circle();
        System.out.printf("The area of the circle of radius %.2f is %.2f\n", circle1.getRadius(), circle1.getArea());

        Circle circle2 = new Circle(25);
        System.out.printf("The area of the circle of radius %.2f is %.2f\n", circle2.getRadius(), circle2.getArea());

        Circle circle3 = new Circle(125);
        System.out.printf("The area of the circle of radius %.2f is %.2f\n", circle3.getRadius(), circle3.getArea());

        // modify circle
        circle2.setRadius(100);
        System.out.printf("The area of the circle of radius %.2f is %.2f\n", circle2.getRadius(), circle2.getArea());
        System.out.printf("The total number of circles is %d", Circle.getNumberOfObjects());
        
    }
}

