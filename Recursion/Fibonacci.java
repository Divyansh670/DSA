package Recursion;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        System.out.print("Enter Input:");
        int n=sc.nextInt();
        System.out.println();
        for(int i=0;i<=n-1;i++)
        {
            if(i==n-1)
            System.out.print(f(i));
            else{
        System.out.print(f(i)+",");
            }
        }
    }
    static int f(int i)
    {
        if(i<=1)
        return i;
        int fi=f(i-1);
        int ls=f(i-2);
        return fi+ls;
    }
}