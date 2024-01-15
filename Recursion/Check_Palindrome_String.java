package Recursion;

import java.util.Scanner;

public class Check_Palindrome_String {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print("Enter Input:");
        String n=sc.nextLine();
        boolean b=f(0,n.length()-1,n);
        if(b==true)
        System.out.println("It is Palindrome");
        else{
            System.out.println("It is not Palindrome");
        }
    }
    static boolean f(int i,int j,String n)
    {
        if(i>=j)
        return true;
        if(n.charAt(i)!=n.charAt(j))
        return false;
        return f(i+1,j-1,n);
    }
}
