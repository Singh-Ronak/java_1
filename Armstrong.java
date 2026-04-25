public class Armstrong {
    public static void main(String[] args){
        System.out.println("all 3 digit arstrong numbers are: ");
        for(int i = 100; i<=1000 ; i++){
            if(isArmstrong(i)){System.out.println(i);}
        }
    }
    static boolean isArmstrong(int n){
        int rem, sum = 0, real = n;
        while(n>0){
            rem = n%10;
            sum += rem*rem*rem;
            n = n/10;
        }
        return sum == real;
    }
    
}
