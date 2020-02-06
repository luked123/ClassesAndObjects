/** Class that represents a quadratic equation */
public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    /** Constructor that requires the three coefficients of a quadratic equation in the following equation
     * aX^2 + bX + c = 0*/
    QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /** Returns the 'a' coefficient */
    public double getA(){
        return a;
    }

    /** Returns the 'b' coefficient */
    public double getB(){
        return b;
    }

    /** Returns the 'c' coefficient */
    public double getC() {
        return c;
    }

    /** Returns the discriminant of the quadratic equation */
    public double getDiscriminant(){
        return Math.pow(b, 2) - 4 * a * c;
    }

    /** Returns the 1st root of the quadratic equation
     * if the discriminant is negative we return 0 */
    public double getRoot1(){
        double discriminant = getDiscriminant();
        if(discriminant < 0){
            return 0;
        }

        // Not a quadratic equation
        if(a == 0){
            return 0;
        }

        return (-b + Math.pow(discriminant, (.5))) / (2 * a);
    }

    /** Returns the 2nd root of the quadratic equation
     * if the discriminant is negative we return 0 */
    public double getRoot2(){
        double discriminant = getDiscriminant();
        if(discriminant < 0){
            return 0;
        }

        // Not a quadratic equation
        if(a == 0){
            return 0;
        }

        return (-b - Math.pow(discriminant, (.5))) / (2 * a);
    }

}
