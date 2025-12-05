package Practice;
import java.util.*;
import java.io.*;

public class Sum_of_non_prime_index{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            boolean isprime=true;
            if(i<=1){
                isprime=false;
            }
            else if(i==2){
                isprime=true;
            }
            else if(i%2==0){
                isprime=false;
            }
            else{
                for(int j=3;j<n;j++){
                    if(i%j==0){
                        isprime=false;
                        break;
                    }
                }
            }
            if(!isprime){
                sum+=arr[i];
            }
        }
        System.out.println(sum);
    }
}
