import java.util.Scanner;

public class Another {
    public static void main(String[] args){
        try {
            // Declaration section
            double x, y;
            Scanner stan = new Scanner(System.in);

            // Input
            System.out.print("Enter the value for x: ");
            x = stan.nextDouble();
           
            // Processing
            if (x > 0) {
                y = Math.sqrt(x) / x;
                System.out.println("y = " + y);
            } else {
                System.out.println("Enter a number greater than zero");
            }
          
        } catch (Exception e) {
            System.out.println("Enter only numbers");
        }
    }
}




