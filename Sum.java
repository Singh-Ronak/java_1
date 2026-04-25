import java.util.*;
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char input;
        int num1, num2;
        do {
            System.out.print("Enter number 1: ");
            num1 = sc.nextInt();
            System.out.print("Enter number 2: ");
            num2 = sc.nextInt();
            System.out.println("Sum = "+sum(num1, num2));
            System.out.print("To continue press y\nTo Stop press x or X: ");
            input  = sc.next().trim().charAt(0);
        }while(input != 'x' && input != 'X');
    }
    static int sum(int a, int b){
        int sum = a+b;
        return sum;
    }    
}
