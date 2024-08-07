import java.util.Scanner;
//y = 2/(3+x) iff x
public class Matherror {
   
    public static void main(String[] args) {
        try {
            //declaration section
            Scanner stan = new Scanner(System.in);
            double x, y ; 

              // Input section
        System.out.print("Enter the value for x: ");
        x = stan.nextDouble();

        //processing  section
        if (x != -3){
            y = 2/(3+x);
            System.out.println("y = " +y);
            }
           else {
            System.out.println("x cannot be -3");
           }
    

        } catch (Exception e) {
            System.out.println("Please enter numbers only");
        }
     


        // when using condition statements , formula must be inside the condition curly brackets
       
        
    }
}
