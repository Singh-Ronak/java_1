import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter operator or x for termination: ");
            char op = sc.next().trim().charAt(0);
            if(op == '/' || op =='*' || op == '+' || op == '-' || op == '%'){
                System.out.print("1st number: ");
                int a = sc.nextInt();
                System.out.print("2nd number: ");
                int b = sc.nextInt();
                int res = 0;
                if(op == '/'){res = a/b;}
                else if(op == '*'){res = a*b;}
                else if(op == '-'){res = a-b;}
                else if(op == '+'){res = a+b;}
                else if(op == '%'){res = a%b;}
                System.out.println(res);
            }
            else if(op == 'x' || op == 'X'){System.out.println("Terminated");
                break;
            }
        }
        sc.close();
    }
}
    
