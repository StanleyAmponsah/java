//this is a practical example on the use of equalsignore string classes
import java.util.Scanner;
public class StringEQualsignore {
    public static void main(String[] args) {
        Scanner stan = new Scanner(System.in);
    
        String capital, president, vice, city;

        System.out.println("What is the capital city of Ghana?");
        capital = stan.nextLine();
            if (capital.equalsIgnoreCase("Accra")){
            System.out.println("You are right");
             }else{
            System.out.println("Wrong answer");
            }
       System.out.println();
        System.out.println("Who is the President of Ghana?");
        president = stan.nextLine();
        if (president.equalsIgnoreCase("Nana addo dankwa akuffo addo")) {
            System.out.println("You are right");
        } else {
            System.out.println("You are wrong");
            
        }
        System.out.println();

        System.out.println("When city is the nicest?");
        city = stan.nextLine();
      
        if (city.equals("kumasi")) {
            System.out.println("You are right");
        } else {
            System.out.println("You are wrong");
            
        }
    
    

       System.out.println();
       System.out.println("Who is the vice president of Ghana");
       vice = stan.nextLine();
       if (vice.equalsIgnoreCase("Bawumia")) {
        System.out.println("You are right");
    } else {
        System.out.println("You are wrong");
        
    }
    


}
}