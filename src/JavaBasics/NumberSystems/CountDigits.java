package JavaBasics.NumberSystems;
import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int digit=0;
        while(num!=0){
            num=num/10;
            digit++;
        }
        System.out.print("No of Digits = "+digit);
    }
}
