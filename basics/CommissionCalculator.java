import java.util.Scanner;
public class CommissionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the daily sales
        System.out.print("Enter daily sales: ");
        double salesAmount = scanner.nextDouble();
       //initialize commission with a default value of 0.0
      double commission = 0.0;

      
        if (salesAmount < 200 ) {
            commission = 0.10 * salesAmount;
            
        }
        else if (salesAmount >= 200 && salesAmount < 800) {
            commission = 0.15 * salesAmount;
            
        }else {
            commission = 0.2 * salesAmount;
            
        }
        // Print the calculated commission to the user
        System.out.printf("Commission: GH¢%.2f%n",commission);

        
    }
}
