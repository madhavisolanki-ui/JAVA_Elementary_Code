package Practice;

import java.util.*;
import java.io.*;

public class count_unique_digits {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        boolean []seen=new boolean[10];
        int count=0;
        while(a>0){
            int digit=a%10;
            if(!seen[digit]){
                seen[digit]=true;
                count++;
            }
            a/=10;
        }
        System.out.println(count);
    }
}
