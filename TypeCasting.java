
import java.util.*;
public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // float num = sc.nextFloat();
        // System.out.print(num);

        // Type Casting
        // int num = (int)(55.45);
        // System.out.println(num);

        // Automatic Type Promotion in expressions
        // int a  = 257;
        // byte b = (byte)(a); // 257 % 256 == 1
        // System.out.print(b);

        // byte a = 40 ;
        // byte b = 50 ;
        // byte c = 100;
        // int d = (a*b)/c; // the expression is performed using integers
        // System.out.println(d);

        // int number = 'A';
        // System.out.println(number);

        byte b = 40;
        char c = 'a';
        short s = 1024;
        int i = 5000;
        float f = 1.25f;
        double d = 0.25;
        double res = (f*b) + (i/c) - (d*s); // double = float + int - double
        System.out.println((f*b)+" "+(i/c)+" "+(d*s)); 
        System.out.println(res); 
    }
    
}
