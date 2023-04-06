import java.util.Scanner;
public class Factorial_number {

    //main method
    public static void main(String[] args) {

        //object of scanner class  or call the scanner
        Scanner input = new Scanner(System.in);
        //Gives Prompt
        System.out.println("Enter a number to find the factorial: ");
        //Enter the times you want to run
        int number = input.nextInt();
        //Declares new int
        int factor = 1;
        //Runs loop and multiplies factor each time run
        for (int i = 1; i <= number; i++)
        {
            //Condition for factor
            factor = factor * i;
        }
        //Prints out final number
        System.out.println(factor);

    }

}
