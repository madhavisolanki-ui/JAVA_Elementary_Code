package Practice;
import java.util.*;
import java.io.*;

public class most_frequently{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[] arr=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        }
        int [] freq=new int[10];
        for(int i=0;i<n;i++){
            long num=arr[i];
            if(num==0) freq[0]++;
            while(num>0){
                int digit=(int)num%10;
                freq[digit]++;
                num/=10;
            }
        }
        int maxfreq=-1;
        int resultdigit=-1;
        for(int digit=0;digit<=9;digit++){
            if(freq[digit]>maxfreq){
                maxfreq=freq[digit];
                resultdigit=digit;
            }
            else if(freq[digit]==maxfreq && digit>resultdigit){
                resultdigit=digit;
            }
        }
        System.out.println(resultdigit);
    }
}
