package Patterns;

import java.util.Scanner;

public class p6 {
    
    public static void main(String[] args) {
         Scanner ob=new Scanner(System.in);
        System.err.print("Enter n:");
        int n=ob.nextInt();
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=n;j++)
        {
            if(j+i>n)
            System.out.print("*");
            else{
                System.out.print(" ");
            }
        }
        System.err.println();
    }
    }  
}
