package Recursion;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
         System.out.println("Enter the n:");
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();
        System.out.println(f(n));
    }
    static long f(long n)
    {
        if(n==0)
        return 1;
        return n*f(n-1);
    }
}