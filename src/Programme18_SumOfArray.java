import java.util.Arrays;

/**
 * Write a Java program to sum values of an array.
 */
public class Programme18_SumOfArray {
    public static void main(String[] args) {
        int [] numArrays = {
                1789,2035,1899,2040,1950,2255,7897,1455,787
        };
        int sum = 0;
        for(int i = 0; i <numArrays.length; i++){
            sum = sum+ numArrays[i];
        }
        System.out.println("Values of the elements of the array are: " + Arrays.toString(numArrays));
        System.out.println("Sum of all the values of the array are: " + sum);
    }

}
