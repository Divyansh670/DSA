package Patterns;

import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
          Scanner ob=new Scanner(System.in);
        System.out.print("Enter no. of rows:");
        int n=ob.nextInt();
        System.out.print("Enter no. of columns:");
        int m=ob.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(j>(m/2)+1-i && j<(m/2)+1+i)
                System.out.print("*");
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
