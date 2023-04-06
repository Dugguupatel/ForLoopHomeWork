import java.util.Scanner;
//// Java Program to find sum of series
public class Calculate_theSUM {

    //Main method
    public static void main(String[] args) {
        //object of Scanner class
        Scanner sc = new Scanner(System.in);
        //statement or code to be executed
        System.out.println("Enter any number: ");

        //takes an integer as input
        int num = sc.nextInt();

        double sum = 0.0;

        //statement or code to be executed
        for (int i = 1; i <= num; i++) {
            sum += (1.0/i);

        }
        //print final answer
        System.out.println("The sum of the series is: " + sum);


    }
}
