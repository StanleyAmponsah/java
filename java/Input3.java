import java.util.Scanner;
public class Input3 {
   static  Scanner stan = new Scanner(System.in); 
    public static void main(String[] args) {
      
    
    System.out.println("Welcome to the area calculator");
    System.out.println();
    System.out.println("Enter the radius of your circle");
    System.out.println();

    double radius  = stan.nextDouble();
    double area = Math.PI * (radius * radius);

    System.out.println("The area is " + area);
    }
} 
