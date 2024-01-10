package Recursion;

import java.util.Scanner;

public class print1ton {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=ob.nextInt();
        f(1,n);
    }
    static void f(int i,int n)
    {
        if(i>n)
        return;
        System.out.println(i);
        f(i+1,n);
    }
}
