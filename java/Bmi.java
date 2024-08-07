import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner stan = new Scanner(System.in);
        Double bmi, weight, height;


        System.out.print("Enter your weight in pounds: ");
       weight = stan.nextDouble();

            System.out.println();
        System.out.print("Please enter your height in inches: ");
        height = stan.nextDouble();
       
        bmi = weight * (703 / Math.pow(height, 2));
        System.out.println();
        System.out.printf("Body Mass Index: %.1f\n", bmi);

        // Processing
        if (bmi < 18.5) {
          System.out.println("You are underweight");
        }
        else if (bmi > 25) {
            System.out.println("You are overweight");
        }
            else {
          System.out.println("You are at optimal weight");
            System.out.println("You are overweight");

        }
        stan.close();
    }
    }
}
