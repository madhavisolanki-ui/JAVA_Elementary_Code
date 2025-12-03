package Practice;
import java.util.*;
import java.io.*;

public class second_word_in_uppercse {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String []words=s.trim().split("\\s+");
        if(words.length<2){
            System.out.println("less");
        }
        System.out.println(words[1].toUpperCase());

    }
}
