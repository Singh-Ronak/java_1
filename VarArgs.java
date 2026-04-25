import java.util.*;
public class VarArgs {
    public static void main(String[] args){
        funS("Ronak", "Mohit", "Madhur");
        funI(10, 20, 30);
        multiple(10, 20, "Ronak", "mohit");
    }
    static void funS(String ...v){
        System.out.println(Arrays.toString(v));
    }
    static void funI(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void multiple(int a, int b, String ...v){
        System.out.println(a +" "+ b +" "+ Arrays.toString(v));
    }
    
}
