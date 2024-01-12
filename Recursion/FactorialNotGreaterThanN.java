// You are given an integer ’n’.
// Your task is to return a sorted array (in increasing order) containing all the factorial numbers which are less than or equal to ‘n’.
// The factorial number is a factorial of a positive integer, like 24 is a factorial number, as it is a factorial of 4.
// Note:
// In the output, you will see the array returned by you.
// Example:
// Input: ‘n’ = 7
// Output: 1 2 6
package Recursion;

import java.util.Scanner;

public class FactorialNotGreaterThanN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the n:");
        int n=sc.nextInt();
        int i=1;
        while(true)
        {
            int a=f(i);
            if(a<=n){
            System.out.print(" "+a);
            i++;}
            else break;
        }
    }
    static int f(int i)
    {
        if(i==0||i==1)
        return 1;
        return i*(i-1);
    }
}
