package Practice;
import java.util.*;
import java.io.*;

public class encoded_array{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int [] arr=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        int [] original=new int[a];
        original[a-1]=arr[a-1];
        for(int i=a-2;i>=0;i--){
            original[i]=arr[i]-original[i+1];
        }
        int output=original[0];
        int sum=0;
        for(int x:original){
            sum+=x;
        }
        System.out.println(sum);
    }
}
