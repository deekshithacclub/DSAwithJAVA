package JavaBasics;
import java.util.Scanner;
public class Inputs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        String name=sc.nextLine();//if using nextInt() in the above line nextLine() considers \n as name
        System.out.println("Dear "+name+". Here is the counting");
        for(int i=1;i<=n;i++){
            System.out.print(i+" ");
        }
        System.out.print("Done.");
    }
}
