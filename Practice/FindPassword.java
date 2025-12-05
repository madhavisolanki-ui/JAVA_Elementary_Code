import java.util.*;
import java.io.*;

public class FindPassword{
    // Function to check whether number is stable or unstable
    public static boolean isStable(int n) {
        String s = String.valueOf(n);
        int[] freq = new int[10];

        // Count frequency of each digit
        for (char c : s.toCharArray()) {
            freq[c - '0']++;
        }

        // Find the first non-zero frequency
        int firstFreq = 0;
        for (int f : freq) {
            if (f != 0) {
                firstFreq = f;
                break;
            }
        }

        // Check if all non-zero frequencies are equal
        for (int f : freq) {
            if (f != 0 && f != firstFreq) {
                return false;  // unstable
            }
        }
        return true; // stable
    }

    public static int findPassword(int a, int b, int c, int d, int e) {
        int[] arr = {a, b, c, d, e};
        int stableSum = 0, unstableSum = 0;
        for (int num : arr) {
            if (isStable(num)) {
                stableSum += num;
            } else {
                unstableSum += num;
            }
        }
        return stableSum - unstableSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int input3 = sc.nextInt();
        int input4 = sc.nextInt();
        int input5 = sc.nextInt();
        int result = findPassword(input1, input2, input3, input4, input5);
        System.out.println(result);
    }
}
