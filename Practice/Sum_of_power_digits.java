package Practice;
import java.util.*;
import java.io.*;

public class Sum_of_power_digits {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        String s=String.valueOf(n);
        for(int i=0;i<s.length();i++){
            int currentdigit=s.charAt(i)-'0';
            int powerdigit;
            if(i==s.length()-1){
                powerdigit=0;
            }
            else {
                powerdigit=s.charAt(i+1)-'0';
            }
            sum+=Math.pow(currentdigit,powerdigit);
        }
        System.out.println(sum);
    }
}
