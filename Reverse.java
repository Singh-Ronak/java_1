import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int rev = 0;
        while(num>0){
            int d = num%10;
            rev = rev*10 + d;
            num = num/10;
        }
        System.out.print("reversed number is: "+rev);
    }
    
}
