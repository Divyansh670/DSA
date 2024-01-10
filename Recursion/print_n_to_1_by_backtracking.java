package Recursion;

import java.util.Scanner;

public class print_n_to_1_by_backtracking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        f(1,n);
    }
    static void f(int i,int n)
    {
        if(i>n)
        return;
        f(i+1,n);
        System.out.println(i);
    }
}
