import java.util.*;
import java.io.*;
public class WeightofString {
    public static int weightOfString(String input1, int input2) {
        input1 = input1.toLowerCase();
        int sum = 0;
        for (char ch : input1.toCharArray()) {
            // non-alphabet ignore
            if (ch < 'a' || ch > 'z')
                continue;
            boolean isVowel = (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u');
            // input2 = 0 ⇒ ignore vowels
            if (isVowel && input2 == 0)
                continue;
            // weight = alphabetical position
            int weight = ch - 'a' + 1;
            sum += weight;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        System.out.print("Enter option (0-ignore vowels, 1-include vowels): ");
        int opt = sc.nextInt();
        int result = weightOfString(str, opt);
        System.out.println("Output: " + result);
    }
}
