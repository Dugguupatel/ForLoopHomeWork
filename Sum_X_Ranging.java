import java.util.Scanner;
//first create class
public class Sum_X_Ranging {

//main method
    public static void main(String[] args) {
        //call the scanner class
        Scanner sc = new Scanner(System.in);
        //acknowledge the user what to enter
        System.out.println("Enter any number from 1 to 20: ");
        //storing number in variable using scanner object
        int num = sc.nextInt();

        int sum = 0;
        //now you to put the condition in the for loop[ statement
        for (int i = 1; i < 20; i++) {
            sum += num;
        }
        //print acknowledge the user what to enter
        System.out.println("The sum of num ranging from 1 to 20 is:" + sum);

        }
    }
