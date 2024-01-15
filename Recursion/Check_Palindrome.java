package Recursion;

import java.util.Scanner;

public class Check_Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements:");
        for(int d=0;d<n;d++)
        {
            arr[d]=sc.nextInt();
        }
        System.out.println("The array is:");
        for(int d=0;d<n;d++)
        {
            System.out.print(arr[d]+" ");
        }
        System.out.println();
       boolean b=f(arr,0,n);
       if(b==true)
       System.out.println("It is a Palindrome");
       else{
        System.out.println("It is not Palindrome");
       }
    }
    static boolean f(int arr[],int i,int n)
    {
        if(i>=n/2)
        return true;
        if(arr[i]!=arr[n-i-1])
        return false;
        return f(arr,i+1,n);
    }  
}
