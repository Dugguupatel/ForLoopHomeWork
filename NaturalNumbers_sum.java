import java.util.Scanner;
//First create class
public class NaturalNumbers_sum {

//main method
    public static void main(String[] args) {

        //Call the scanner
        Scanner natural = new Scanner(System.in);
        //acknowledge the user what to enter
        System.out.println("Enter any Number: ");
        int number = natural.nextInt();
        int sum = 0;
        //statement or code to be executed
        for (int i = 1; i <= number ; i++)
        {
            //now you to put the condition in the for loop statement
            System.out.println(("i= " +i));
            System.out.println("sum" +(sum+=i));
        }
        //prints sum of the entered number up to the range
        System.out.println("sum of " +number+ " natural number= " +sum);
    }
}
