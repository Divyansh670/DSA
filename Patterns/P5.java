package Patterns;

import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
        System.err.print("Enter n:");
        int n=sc.nextInt();
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=n;j++)
        {
            if(j>=i)
            System.out.print("*");
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    }
}