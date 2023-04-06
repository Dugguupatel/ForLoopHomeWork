import java.util.Scanner;
//First create class
public class Multiplication_table {

    //Main method
    public static void main(String[] args) {

        //number n for which we have to print the multiplication table
        Scanner sc = new Scanner(System.in);
        //acknowledge the user what to enter
        System.out.println("Enter number: ");

        //reading a number whose table is to be print
        int num = sc.nextInt();

        //loop start execution form and execute until the condition i<=12 becomes false
        for (int i = 1; i <= 12 ; i++) {
            //prints table of the entered number up to the range
            System.out.println(num+" * "+i+" = "+num*i);
        }
    }
}
