import java.util.*;
public class Fib{
    public static void main(String[] args) {
        System.out.println("Program for Fabonacci series.");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        int a=0,b=1,c;
        System.out.print(a+","+b+",");
        for (int i = 0; i < n-2; i++) {
            c = a+b; 
            System.out.print(c+",");
            a=b;
            b=c;
        }
    }
}