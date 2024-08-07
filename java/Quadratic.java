import java.util.Scanner;

public class Quadratic {
    static Scanner stan = new Scanner(System.in);

    public static void main(String[] args) {
//x1 , 2 = -b +/- (b^2-4*a*c)^0.5)/2*a
    //assign their data types
        double a, b, c, x1, x2;
        System.out.print("Enter the coefficient of x^2: ");
        a = stan.nextDouble();
        System.out.print("Enter the coefficient of x: ");
        b = stan.nextDouble();
        System.out.print("Enter the value of the constant: ");
        c = stan.nextDouble();

        // evaluate the expression or equation
        x1 = (-b - Math.sqrt(b*b-4*a*c))/ (2*a);
        x2 = (-b + Math.sqrt(Math.pow(b, 2)-4*a*c))/ (2*a);

        // display the output
        System.out.print("The roots are "+x1+" and "+x2);

        
    }
}
