import java.util.*;
import java.io.*;

public class OneDigitToBeRemoved{

    // Function to check palindrome
    public static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    // Function to find which digit should be removed
    public static int digitRemove(int input1) {
        String s = String.valueOf(input1);

        // If already palindrome → return -1
        if (isPalindrome(s)) return -1;

        int i = 0, j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                // Try removing left character
                String removeLeft = s.substring(0, i) + s.substring(i + 1);
                if (isPalindrome(removeLeft)) {
                    return s.charAt(i) - '0';
                }

                // Try removing right character
                String removeRight = s.substring(0, j) + s.substring(j + 1);
                if (isPalindrome(removeRight)) {
                    return s.charAt(j) - '0';
                }
            }
            i++;
            j--;
        }

        return -1; // default (should not reach here normally)
    }

    // MAIN METHOD
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input1 = sc.nextInt();   // user input

        int result = digitRemove(input1);
        System.out.println(result);
    }
}
