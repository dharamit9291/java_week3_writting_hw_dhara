import java.util.Scanner;

public class Programme1_OddEvenTernaryOperator {
    /**
     * 1. Write a java program that tells us that Input number is odd or even?
     * HINT: use ternary operator (? :)
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter any number : ");
        int number = scan.nextInt();
        IsItOddOrEvenNumber(number);
        scan.close();
    }
    public static void IsItOddOrEvenNumber (int number){
        String evenOrOdd = (number %2==0)? "Even":"Odd";
        System.out.println("The " + number + " is " + evenOrOdd + " number");

    }

}
