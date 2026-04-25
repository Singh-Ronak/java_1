import java.util.*;
public class Switch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // String input = sc.next();
        // switch(input){
        //     case "mango": 
        //         System.out.println("king of fruits");
        //         break;
        //     case "apple":
        //         System.out.println("Keeps the doctors away");
        //         break;
        //     default:
        //         System.out.println("I dont know any fact about this fruit");
        // }
        System.out.println("Enter day number: ");
        int input = sc.nextInt();
        switch(input){
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("thursday");
            case 5 -> System.out.println("friday");
            case 6 -> System.out.println("saturday");
            case 7 -> System.out.println("sunday");
            default -> System.out.println("Out of valid Range");
        }
        switch(input){
            case 1,2,3,4,5 -> System.out.println("Weekday");
            case 6,7 -> System.out.println("weekend");
            default -> System.out.println("out of valid range");
        }
    }
    
}
