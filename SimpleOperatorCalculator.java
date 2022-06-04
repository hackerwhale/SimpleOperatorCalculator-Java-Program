import java.util.*;

 
public class SimpleOperatorCalculator {
   public static void main(String args[]){

    char operator;
    int answer=0;


    Scanner sc = new Scanner(System.in);
    System.out.println("/=============================Rules=======================================/");
    System.out.println("1. Value of a and b must be integar number. ");
    System.out.println("2. Integar a must be bigger than b. ");
    System.out.println("3. Operation that can be performed:  { '+',   '-',   '/',   '*',   '%' } ");
    System.out.println("+========================================================================+");
    System.out.println("Enter number a:  ");
    int a = sc.nextInt();
    System.out.println("Enter number b:  ");
    int b = sc.nextInt();
    System.out.println("Which operation would you like to perform? ");
    operator = sc.next().charAt(0);

     switch (operator) {
	case '+': answer = a + b;
	break;
	case '-': answer = a - b;
	break;
	case '*': answer = a * b;
	break;
	case '/': answer = a / b;
	break;
	case '%': answer = a % b;
	break;

      }
       System.out.println(a+ " " + operator+" "+b+ " = "+answer);


    }
}
