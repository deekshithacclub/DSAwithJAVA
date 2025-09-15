package JavaBasics.NumberSystems;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();
        System.out.println("Fibonacci till "+n);
        int fib1=0;
        int fib2=1;
        for(int i=0;i<n;i++){
            System.out.print(fib1+" ");
            int fibRes=fib1+fib2;
            fib1=fib2;
            fib2=fibRes;
        }
    }
}
