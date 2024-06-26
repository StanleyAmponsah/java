// application of some of the string classes
import java.util.Scanner;
public class Stringclass1 {
    public static void main(String[] args) {
        
        Scanner stan = new Scanner(System.in);
        String message;
       
        
        message = "I am learning Java";
         // converting to uppercase
         System.out.println(message.toUpperCase());
         System.out.println(message.toLowerCase());
        // to  remove unwanted spaces
        String space;
            space = "         I am learning Java";
            System.out.println(space.trim());
            System.out.println(message.length());
    
            // findng the position of a text
            System.out.println(message.indexOf("Java"));
    
            //chexck whether there exists other java characters
            String neww = "I am learning Java in a Java class";
            System.out.println(neww.indexOf("Java", 15));
    
            //find a character at a particular position using the charAt 
            System.out.println(message.charAt(10));
            System.out.println(message.charAt(9));
    
            String test = "Java";
            if (message.contains(test)){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
            String test1 = "JAVA";
            // checking if they are the same
            if (test1.equals(test)) {
                System.out.println("they are equal");

            }else{
                System.out.println("they are not eequal");
            }
            
            // to ignore case
          if ( test1.equalsIgnoreCase(test)) {
             System.out.println("They are equal");

          }
          }


        }
     
    

