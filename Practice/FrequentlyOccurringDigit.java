import java.util.*;
import java.io.*;

public class FrequentlyOccurringDigit{
    public static int mostFrequentlyOccurringDigit(long[] input1, int input2) {
        int[] freq = new int[10];
        for (int i = 0; i < input2; i++) {
            long num = input1[i];
            if (num == 0) freq[0]++;
            while (num > 0) {
                int d = (int)(num % 10);
                freq[d]++;
                num /= 10;
            }
        }
        int maxFreq = -1;
        int resultDigit = -1;

        for (int digit = 0; digit <= 9; digit++) {
            if (freq[digit] > maxFreq) {
                maxFreq = freq[digit];
                resultDigit = digit;
            }
            else if (freq[digit] == maxFreq && digit > resultDigit) {
                resultDigit = digit;
            }
        }
        return resultDigit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        long[] arr = new long[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        int ans = mostFrequentlyOccurringDigit(arr, n);
        System.out.println("Most Frequently Occurring Digit = " + ans);
    }
}
