package Patterns;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.print("Enter n:");
        int n=sc.nextInt();
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=n;j++)
        {
            System.out.print("*");
        }
        System.err.println();
    }
}
}