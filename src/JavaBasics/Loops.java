package JavaBasics;
import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
//        int i=1;
//        while(i<=10){
//            System.out.print(i+" ");
//            i++;
//        }
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(i+" ");
        }
        System.out.print("Done.");
    }
}
