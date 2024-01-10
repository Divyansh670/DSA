import java.util.Scanner;

public class multiply {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
         System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        System.out.println("Multiplication =" + a*b);
    }
}