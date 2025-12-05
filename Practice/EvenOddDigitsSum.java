import java.util.*;
import java.io.*;

public class EvenOddDigitsSum {
    // Sum of EVEN digits
    public int EvenDigitsSum(int n){
        int sum = 0;
        while(n > 0){
            int d = n % 10;
            if(d % 2 == 0) sum += d;
            n /= 10;
        }
        return sum;
    }
    // Sum of ODD digits
    public int OddDigitsSum(int n){
        int sum = 0;
        while(n > 0){
            int d = n % 10;
            if(d % 2 != 0) sum += d;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        System.out.print("1 for Even digits sum, 2 for Odd digits sum: ");
        int choice = sc.nextInt();
        EvenOddDigitsSum obj = new EvenOddDigitsSum();
        if(choice == 1){
            int result = obj.EvenDigitsSum(num);
            System.out.println("Even digits sum = " + result);
        }
        else if(choice == 2){
            int result = obj.OddDigitsSum(num);
            System.out.println("Odd digits sum = " + result);
        }
        else{
            System.out.println("Invalid choice");
        }
    }
}
