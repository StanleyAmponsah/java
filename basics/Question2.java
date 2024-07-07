import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = 0;
        double b = 0;
        boolean validInput = false;
        
        // Input and validation for 'a'
        while (!validInput) {
            System.out.print("Enter value for a: ");
            if (scanner.hasNextDouble()) {
                a = scanner.nextDouble();
                if (a < 0) {
                    System.out.println("Error: 'a' must be non-negative.");
                } else {
                    validInput = true;
                }
            } else {
                System.out.println("Error: Please enter a valid number.");
                scanner.next(); // Clear the invalid input
            }
        }

        validInput = false;
        // Input and validation for 'b'
        while (!validInput) {
            System.out.print("Enter value for b: ");
            if (scanner.hasNextDouble()) {
                b = scanner.nextDouble();
                validInput = true;
            } else {
                System.out.println("Error: Please enter a valid number.");
                scanner.next(); // Clear the invalid input
            }
        }

        // Evaluate the equation
        try {
            double y = Math.sqrt(a) / (b + 2);
            System.out.println("The value of y is: " + y);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } 
        
    }
}
