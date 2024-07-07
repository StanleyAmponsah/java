import java.util.Scanner;

public class StringExtractor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input sentence from user
        System.out.print("Enter a sentence:");
        String sentence = scanner.nextLine();

        // Input starting position
        System.out.print("Enter string extraction starting point: ");
        int start = scanner.nextInt();

        // Input ending position
        System.out.print("Enter string extraction ending point: ");
        int end = scanner.nextInt();

        // Extract and display the substring
        String extractedString = sentence.substring(start, end);
        System.out.println("Extracted substring: " + extractedString);

    
    }
}
