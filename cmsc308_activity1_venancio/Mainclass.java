import java.util.Scanner;
public class Mainclass {

public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.print("Enter the first value  : ");
    double n1 = scan.nextDouble();

    System.out.print("Enter the second value : ");
    double n2 = scan.nextDouble();

    System.out.print("Select an operation : ");
    System.out.println(" +  -  *  / ");
    
    char operator;   
    operator = scan.next().charAt(0);

    switch (operator) {

        case '+' : System.out.println("Answer = The sum is  " + (n1 + n2));
        break;

        case '-' : System.out.println("Answer = The difference is " + (n1 - n2));
        break;

        case '*' : System.out.println("Answer = The product is " + (n1 * n2));
        break;

        case '/' : System.out.println("Answer = The quotient is " + (n1 / n2));
        break;

        default:
        System.out.println("invalid input ");
        break;

    }
  }
}
