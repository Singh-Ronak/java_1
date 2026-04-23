import java.util.*;

public class Temp{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Temperature in Celcius: ");
        float c = sc.nextFloat();
        float f = (c * 9/5 ) + 32;
        System.out.println("Temperature in Fahrenheit: "+f);
    }
}