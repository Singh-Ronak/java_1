import java.util.*;
public class Swap {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    
        System.out.print("enter num1: ");
        int num1 = sc.nextInt();
        System.out.print("enter num2: ");
        int num2 = sc.nextInt();

        System.out.println("num1: "+num1+" num2: "+num2+" before swap");

        swap(num1, num2);
        System.out.println("num1: "+num1+" num2: "+num2+" after swap");
        
    }
// this doesn't work because in java the arguments are by copy of values if we dont chnage the object directly a new object is created.

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;

    }
}
