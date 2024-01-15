package Recursion;

import java.util.Scanner;

public class ReverseOfArray1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int d=0;d<n;d++)
        {
            arr[d]=sc.nextInt();
        }
        System.out.println("The Original array is:");
        for(int d=0;d<n;d++)
        {
            System.out.print(arr[d]+" ");
        }
        f(arr,0,n-1);
        System.out.println();
        System.out.println("The Reversed array is:");
        for(int d=0;d<n;d++)
        {
            System.out.print(arr[d]+" ");
        }
    }
    static void f(int arr[],int i,int j)
    {
        if(i>=j)
        return;
        swap(i,j,arr);
        f(arr,i+1,j-1);
    }
    static void swap(int i,int j,int arr[])
    {
        int c;
        c=arr[i];
        arr[i]=arr[j];
        arr[j]=c;
    }
}
