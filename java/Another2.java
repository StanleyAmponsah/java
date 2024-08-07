import java.util.Scanner;
public class Another2 {
    public static void main(String[] args) {

        try {
            
            Scanner stan = new Scanner(System.in);
        
            System.out.println("Enter some fucking numbers here");
           Double x = stan.nextDouble();

           System.out.println("This is what you entered: "+x);
    
        } catch (Exception e) {
            System.out.println("Enter numbers only");
        }
       

    }
}
