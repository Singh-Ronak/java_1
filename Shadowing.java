public class Shadowing {
    // class variable - higher level
    static int x = 90; //it is shadowed a lower level scope variable
    public static void main(String[] args) {
        System.out.println(x);
        // variable with lower level scope shadows the higher level scope variable
        int x = 40;   
        System.out.println(x);
        // value of x is changed for this function only   
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
    
}
