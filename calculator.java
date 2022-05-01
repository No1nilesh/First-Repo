import java.util.*;

public class calculatou {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int a= sc.nextInt();
      int b= sc.nextInt();

      int Add=a+b;
      int multiply=a*b;
      int sub=a-b;
      int div=a/b;

     
int button=sc.nextInt();
switch(button) {
    case 1 : System.out.println(Add);
    break;
    case 2 : System.out.println(multiply);
    break;
    case 3 : System.out.println(sub);
    break;
    case 4 : System.out.println(div);
    break;
    default : System.out.println("Invalid");
}

    }
 
}


        
   
