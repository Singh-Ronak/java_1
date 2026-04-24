import java.util.*;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();   
        int b = sc.nextInt();   
        int c = sc.nextInt();
        
        // int max = a;
        // if(b>max){max = b;}
        // if(c>max){max = c;}

        // int max = 0;
        // if(a>b){if (a>c){max = a;}
        //         else{max = c;}}
        // else{if(b>c){max = b;}
        //     else{max = c;}}

        int max = Math.max(a,b);
        max = Math.max(max,c);
        System.out.println(max);
    }
    
}
