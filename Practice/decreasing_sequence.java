package Practice;
import java.util.*;
import java.io.*;

public class decreasing_sequence {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        int maxlen=0;
        int currlen=1;
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]){
                currlen++;
            }
            else {
                if (currlen > 1) {
                    count++;
                    maxlen = Math.max(currlen, maxlen);
                }
                currlen = 1;
            }
        }
        if(currlen>1){
            count++;
            maxlen=Math.max(currlen,maxlen);
        }
        System.out.println(Arrays.toString(new int[]{count,maxlen}));
    }
}
