import java.util.*;
public class Casecheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().trim().charAt(0);

        // a -> 97 , z -> 122, A ->65, Z->90

        // if(c>96 && c<123){System.out.println("Character is lower case");}
        // else if(c>64 && c<91){System.out.println("Character is Upper Case");}
        // else{System.out.println("Character is special");}

        if(c>='a' && c<='z'){System.out.println("Character is lower case");}
        else if(c>='A' && c<='Z'){System.out.println("Character is Upper Case");}
        else{System.out.println("Character is special");}
        sc.close();
    }
    
}
