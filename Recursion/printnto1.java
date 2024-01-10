package Recursion;

import java.util.Scanner;

public class printnto1 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=ob.nextInt();
        f(n,n);
    }
    static void f(int i,int n)
    {
        if(i<1)
        return;
        System.out.println(i);
        f(i-1,n);
    }
}
