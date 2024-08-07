import java.util.Scanner;
public class Try12 {
    public static void main(String[] args) {
        double PI = 3.142;
        double g = 9.8;
        try {
            
       
        Scanner stan = new Scanner(System.in);
        System.out.println("Enter the value of L: ");
        double L = stan.nextDouble();


        if (L<0) { 
            System.out.println("Enter a positive number");
        }
        else {
        double T = 2 * PI * Math.sqrt(L/g);
        
        System.out.println("The value of T is: " +T);
        }
   
    } catch (Exception e) {
        System.out.println("Enter only positive numbers");
    }
    }

}

 
