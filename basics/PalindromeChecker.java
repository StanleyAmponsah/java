import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input word or phrase from user
        System.out.print("Enter the word or phrase to check: ");
        String input = scanner.nextLine();
        
        // Remove non-alphanumeric characters and convert to lower case
        String cleanedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Check if the cleaned input is a palindrome
        boolean isPalindrome = isPalindrome(cleanedInput);

        // Output result
        System.out.println("Output: " + isPalindrome);

        scanner.close();
    }

    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
