

import java.util.*;

public class data_types{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Primitive data types are those which cant be further broken into other data types.
        System.out.println("Primitive Data Types");
        int roll_no = 64;
        long largeInteger = 3475816235985468946L;
        char letter = 'r';
        float decimal = 98.76f;
        double largeDecimal = 45645454.465458;
        boolean check = false;
        System.out.println("int\t->\t"+roll_no);
        System.out.println("long\t->\t"+largeInteger);
        System.out.println("char\t->\t"+letter);
        System.out.println("float\t->\t"+decimal);
        System.out.println("double\t->\t"+largeDecimal);
        System.out.println("boolean\t->\t"+check+"\n");
        
        System.out.println("Non Primitive Data Types");
        String name = "Ronngh";
        System.out.println("String\t->\t"+name);
        
        
    }
}