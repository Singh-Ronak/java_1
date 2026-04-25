import java.util.*;
public class FunOverload {
    public static void main(String[] args) {
        sum(10,20);
        sum(10,20,30);
        fun("Ronak", "Mohit", "Madhur");
        fun(10, 20, 30);
        // fun(); --> this generates ambiguity.
    }
    static void fun(String ...v){
        System.out.println(Arrays.toString(v));
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void sum(int a, int b){
        System.out.println(a+b);
    }
    static void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }
    
}
