import java.util.*;
public class Factorial {
    public static void calculateFactorial(int n) {
        if(n<0) {
            System.out.println("Invalid numebr :");
            return;
        }
       int facto=1;
        for(int i=n; i>=1; i--) {
            facto =facto*i;
        }
        System.out.println(facto);
        return;
             
    }
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        calculateFactorial(n);
    }

}
