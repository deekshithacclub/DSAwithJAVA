package JavaBasics.NumberSystems;
import java.util.Scanner;
public class InverseNum {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int num=sc.nextInt();
        int pos=0;
        int invNum=0;
        while(num!=0){
            int ipos=num%10;
            pos++;
            invNum=invNum+pos*(int)Math.pow(10,ipos-1);
            num=num/10;
        }
        System.out.println(invNum);
    }
}
