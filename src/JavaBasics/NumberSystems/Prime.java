package JavaBasics.NumberSystems;
import java.util.Scanner;
public class Prime {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter t:");
//        int t=sc.nextInt();
//        while (t-->0) {
//            System.out.print("Enter n:");
//            int n = sc.nextInt();
//            boolean isPrime=true;
//            for (int i = 2; i * i <= n; i++) {
//                if (n % i == 0) {
//                    isPrime=false;
//                    break;
//                }
//            }
//            if(isPrime){
//                System.out.println("Prime");
//            }else{
//                System.out.println("Not Prime");
//            }


        System.out.println("Enter range:");
        int low=sc.nextInt();
        int high=sc.nextInt();
        while(low<=high){
            int n=low;
            int count=0;
            for(int i=2;i*i<=n;i++){
                if(n%i==0){
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.println(n);
            }
            low++;
        }
    }
}
