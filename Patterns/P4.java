package Patterns;

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
        System.err.print("Enter n:");
        int n=sc.nextInt();
    for(int i=1;i<=n;i++)
    { 
        for(int j=1;j<=n;j++)
        {
            if(i==1||i==n)
            System.out.print("*");
           else if(j==1||j==n){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
            System.out.print(" ");
        }
        System.err.println();
    }
    } 
}
