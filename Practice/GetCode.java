import java.util.*;
import java.io.*;

public class GetCode{
    // Function to calculate digit sum repeatedly until single digit
    public static int getSingleDigit(int num) {
        while (num > 9) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }

    // Function to solve the PIN logic
    public static int getCodeThroughStrings(String input1) {

        String[] words = input1.trim().split("\\s+");
        int totalLength = 0;

        for (String w : words) {
            totalLength += w.length();
        }

        return getSingleDigit(totalLength);
    }

    // MAIN METHOD
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String input = sc.nextLine();
        int result = getCodeThroughStrings(input);
        System.out.println("Numeric PIN: " + result);
    }
}
