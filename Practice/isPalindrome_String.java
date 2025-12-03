package Practice;
import java.util.*;
import java.io.*;

public class isPalindrome_String {
    public static void main() {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.toLowerCase();
        String rev=new StringBuilder(s).reverse().toString();
        if(s.equals(rev)){
            System.out.println(2);
        }
        else{
            System.out.println(1);
        }
    }
}
