package Practice;

import java.io.*;
import java.util.*;

public class isprime {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a<=1){
            System.out.println(1);
        }
        else{
            int flag=0;
            for(int i=2;i*i<=a;i++){
                if(a%i==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println(2);
            }
            else{
                System.out.println(1);
            }
        }
    }
}
