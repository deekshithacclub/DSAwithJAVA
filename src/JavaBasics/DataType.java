package JavaBasics;

import org.w3c.dom.ls.LSOutput;

public class DataType {
    public static void main(String[] args) {
        int x = 15;
        int y = 10;
        //sum
        int sum =x+y;
        System.out.println("Sum of "+x+" and "+y+" is "+sum);
        //product
        int prod=x*y;
        System.out.println("Product of "+x+" and "+y+" is "+prod);
        //x/y y/x x%y
        int v1=x/y;
        int v2=y/x;
        int v3=x%y;
        System.out.println(v1+"  "+v2+"  "+v3);
        //exp
        int expr=(x*y)/(x+y);
        System.out.println(expr);
    }
}
