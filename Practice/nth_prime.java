package Practice;
import java.util.*;
import java.io.*;

public class nth_prime {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int count=0;
        int num=1;
        while(count<a){
            num++;
            int flag=1;
            if(num<=1){
                flag=0;
            }
            else if(num==2){
                flag=1;
            }
            else if(num%2==0){
                flag=0;
            }
            else {
                for(int i=3;i*i<=a;i+=2) {
                    if (num % i == 0){
                        flag = 0;
                        break;
                    }
                }
            }
            if(flag==1)
                count++;
        }
        System.out.println(num);
    }
}
