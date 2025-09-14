package JavaBasics;
import java.util.Scanner;
public class ConditionalStatements {
    public static void main(String[] args) {
        //Even or Odd
        /*int x=5;
        if(x%2==0){
            System.out.println(x+" is Even");
        }else{
            System.out.println(x+" is Odd");
        }
        System.out.println("Hardwork is better than Smartwork");
        */

        //greater or smaller or equal
        /*int n1=10;
        int n2=10;
        if(n1==n2){
            System.out.println(n1+" and "+n2+" are Equal");
        }else{
            if(n1>n2){
                System.out.println(n1+" is Greater than "+n2);
            }else{
                System.out.println(n1+" is Smaller than "+n2);
            }
        }*/
        //Practice que
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks=sc.nextInt();
        if(marks>90) System.out.println("Excellent");
        else if(marks>80) System.out.println("Good");
        else if(marks>70) System.out.println("Fair");
        else if(marks>60) System.out.println("Meets Expectation");
        else System.out.println("Below Par");
    }
}
