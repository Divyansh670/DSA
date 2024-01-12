import java.util.Scanner;

public class sum_of_n_veryImportant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the n:");
        int n=sc.nextInt();
        System.out.println(n*(n+1)/2);
    }
}
