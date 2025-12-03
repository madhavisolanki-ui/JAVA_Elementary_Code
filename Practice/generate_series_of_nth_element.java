package Practice;
import java.util.*;
import java.io.*;

public class generate_series_of_nth_element{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int n=sc.nextInt();
        int result;
        if(n==1){
            result=a;
        }
        else if(n==2){
            result=b;
        }
        else if(n==3){
            result=c;
        }
        else{
            int gap1=b-a;
            int gap2=c-b;
            int term=c;
            for(int i=4;i<=n;i++){
                if(i%2==0){
                    term+=gap1;
                }
                else{
                    term+=gap2;
                }
            }
            result=term;
        }
        System.out.println(result);
    }
}
