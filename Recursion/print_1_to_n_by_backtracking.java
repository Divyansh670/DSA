package Recursion;

import java.util.Scanner;

public class print_1_to_n_by_backtracking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        f(n,n);
    }
    static void f(int i,int n)
    {
        if(i<1)
        return;
        f(i-1,n);
        System.out.println(i);
    }
}
