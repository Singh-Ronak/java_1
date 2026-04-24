import java.util.*;

public class Fibonnaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int temp = a;
        // nth fibonnaci number
        // System.out.print(a);
        for(int i = 2; i<n; i++){
            // System.out.print(","+b);
            temp = b;
            b = a + b ;
            a = temp;
        }
        System.out.print(b);

    }
    
}
