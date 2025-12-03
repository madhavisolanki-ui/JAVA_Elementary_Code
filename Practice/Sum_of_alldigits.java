package Practice;
import java.util.*;
import java.io.*;

public class Sum_of_alldigits{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int l;
        while(a>9){
            int sum=0;
            while(a>0){
                l=a%10;
                sum+=l;
                a/=10;
            }
            a=sum;
        }
        System.out.println(a);
    }
}
