import java.util.Scanner;
/**
 * Write a java program to input any number and find out if it’s odd or even
 */
public class Programme6_OddEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number you want to check : ");
        int number  = scan.nextInt();
        Programme6_OddEven oddEven = new Programme6_OddEven();
        System.out.println(number + " is " + oddEven.isItEvenOrOddNumber(number) + " " +
                "number" );
        scan.close();
    }
    public String isItEvenOrOddNumber (int number){
        if (number %2 == 0){
            return "Even";
        } else {
            return "Odd";
        }
    }
}
