//y = x^2 + 2
import java.util.Scanner;

public class Input2{
    // Declare and create Scanner object
static Scanner stan = new Scanner(System.in);
    public static void main(String[] args) {

        
        System.out.print("Enter your name: ");
        String name = stan.nextLine();
        System.out.println("Hello "+ name);
    
        System.out.print("Enter the value for x: ");
        double x = stan.nextDouble();
        //evaluate the expression
       double y = Math.pow(x, 2) + 2;
        System.out.println("The answer is "+y);



    }
}
