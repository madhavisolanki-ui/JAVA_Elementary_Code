package Practice;
import java.util.*;
import java.io.*;

public class Nambiar_Number {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String s=String.valueOf(a);
        int n=s.length();
        int index=0;
        StringBuilder result=new StringBuilder();
        while(index<n){
            int firstdigit=s.charAt(index)-'0';
            int sum=firstdigit;
            boolean isfirstdigit=(firstdigit%2!=0);
            index++;
            while(index<n){
                int d=s.charAt(index)-'0';
                sum+=d;
                boolean isSumodd=(sum%2!=0);
                if(isSumodd!=isfirstdigit){
                    index++;
                    break;
                }
                index++;
            }
            result.append(sum);
        }
        System.out.println(result);
    }
}
