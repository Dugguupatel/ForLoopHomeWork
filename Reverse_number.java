import java.util.Scanner;
//first create class
public class Reverse_number {
    //main method
    public static void main(String[] args) {
        //call the scanner class
        Scanner sc = new Scanner(System.in);
        //acknowledge the user what to enter
        System.out.println("Enter the number");
        //storing number in variable using scanner object
        int num = sc.nextInt();

        int num1 = 1;

        //now you to put the condition in the for loop statement
        for (int i = num; i >= 1; i--) {
            num1 = num1 * i;

            //print final number
            System.out.println(i);

        }
    }
}
