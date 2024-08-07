import java.util.Scanner;

public class Recap {
    static Scanner stan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to my Java Program");
        System.out.println();
        System.out.print("Please Enter your name:");
    
        String name = stan.nextLine();
        System.out.print("Please Enter your age");
        int age = stan.nextInt();

        System.out.print("Please Enter your class:");
        int classs = stan.nextInt();

        
        
        System.out.println();
        System.out.println("Welcome " + name);
        System.out.println("You are "+age+" years old");
        System.out.println("Your class is " + classs);
        
    }
}
