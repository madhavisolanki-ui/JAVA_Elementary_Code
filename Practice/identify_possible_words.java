package Practice;
import java.util.*;
import java.io.*;

public class identify_possible_words{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        a=a.toLowerCase();
        String [] word=b.split(":");
        List<String> result=new ArrayList<>();
        for(String s:word){
            String low=s.toLowerCase();
            if(low.length()!=a.length()){
                continue;
            }
            boolean match=true;
            for(int i=0;i<a.length();i++){
                if(a.charAt(i)!='_'){
                    if(a.charAt(i)!=low.charAt(i)){
                        match=false;
                        break;
                    }
                }
            }
            if(match){
                result.add(low.toUpperCase());
            }
        }
        if(result.size()==0){
            System.out.println("ERROR-009");
        }
        else {
            System.out.println(String.join(":", result));
        }
    }
}
