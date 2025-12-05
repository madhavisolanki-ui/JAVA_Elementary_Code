package Practice;
import java.util.*;
import java.util.*;

public class Add_Sub_on_N {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int opt=sc.nextInt();
        int result=N;
        boolean minus=(opt==1);
        for(int i=N-1;i>=1;i--){
            if(minus){
                result-=i;
            }else{
                result+=i;
            }
            minus=!minus;
        }
        System.out.println(result);
    }
}
