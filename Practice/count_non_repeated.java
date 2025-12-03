package Practice;
import java.util.*;
import java.io.*;

public class count_non_repeated {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] freq=new int[10];
        int count=0;
        while(a>0){
            int digit=a%10;
            freq[digit]++;
            a/=10;
        }
        for(int i=0;i<10;i++){
            if(freq[i]==1){
                count++;
            }
        }
        System.out.println(count);
    }
}
