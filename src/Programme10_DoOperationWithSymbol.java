import java.util.Scanner;
/**
 * 10.Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */
public class Programme10_DoOperationWithSymbol {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int x = scan.nextInt();
        System.out.print("Enter the second number : ");
        int y = scan.nextInt();
        System.out.print("Please select the calculation symbol +,-,*,/ : ");
        char symbol = scan.next().charAt(0);
        doOperationBySelectingSymbol(x,y,symbol);
        scan.close();
    }
    public static void doOperationBySelectingSymbol(int x,int y, char symbol){
       if (symbol == '+'){
           System.out.println(x + " + " + y + " = " + (x + y));
       } else if (symbol == '-'){
           System.out.println(x + " - " + y + " = " + (x - y));
       } else if (symbol == '*'){
           System.out.println(x + " x " + y + " = " + (x * y));
       } else if (symbol == '/'){
           System.out.println(x + " / " + y + " = " + (x / y));
       } else {
           System.out.println("Please enter correct symbol +,-,*,/");
       }
    }
 }
