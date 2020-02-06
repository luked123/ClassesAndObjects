import java.util.Scanner;

/** Driver for QuadraticEquation */
public class TestQuadraticEquation {
    public static void main(String[] args){
        // Create scanner object for input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the coefficients a, b, c of a quadratic equation (EG aX^2 + bX + c): ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a, b, c);

        if(equation.getDiscriminant() > 0){
            System.out.println("The two roots are");
            System.out.println(equation.getRoot1());
            System.out.println(equation.getRoot2());
        }
        else if(equation.getDiscriminant() == 0){
            System.out.println("The only root is");
            System.out.println(equation.getRoot1());
        }
        else{
            System.out.println("There are no real roots");
        }
    }
}
