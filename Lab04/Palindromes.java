import java.util.Scanner;

public class Palindromes {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scan.next();

        if (isPalindrome(word)) {
            System.out.println(word + " is a palindrome!");
        } else {
            System.out.println(word + " is NOT a palindrome!");
        }
    }

    public static boolean isPalindrome(String word) {
        
        String lowercaseWord = word.toLowerCase();

        for (int i = 0; i < lowercaseWord.length() / 2; i++) {
            char startChar = lowercaseWord.charAt(i);
            char endChar = lowercaseWord.charAt(lowercaseWord.length() - 1 - i);
            if (startChar != endChar) {
                return false;
            }
        }
        return true;
    }

}
