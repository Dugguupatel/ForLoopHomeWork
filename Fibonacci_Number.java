//fibonacci series based on the user print
import java.util.Scanner;
public class Fibonacci_Number {

    //main method
    public static void main(String[] args) {

        int n;
        int num1 = 1;
        int num2 = 1;

        //call the scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("How many numbers you want in Fibonacci: ");
        //set it to the number of element you want in the Fibonacci Series
        n = sc.nextInt();
        //Acknowledge the user what to enter
        System.out.println("Fibonacci Series of " + n + " numbers;");

        //Using loop
        for (int i = 1; i <= n ; i++)
        {
            System.out.println(num1 + " ");

            //compute the next term
            int number = num1 + num2;
            num1 = num2;
            num2 = number;
        }
    }
}
