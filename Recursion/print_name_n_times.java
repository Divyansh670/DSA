package Recursion;

import java.util.Scanner;

public class print_name_n_times {
   
    static void f(int i, int n)
    {
        if(i>n)
        return;
        System.out.println("Divyansh");
        f(i+1,n);
    }
     public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int i=1;
        f(i,n);
    }
}
