import java.util.Scanner;
//first create class
public class Prime_number {

    //main method
    public static void main(String[] args) {

        int i, number,count =0;
        //call the scanner class
        Scanner sc = new Scanner(System.in);
        //acknowledge the user what to enter
        System.out.println("Enter a number : ");
        //storing number in variable using scanner object
        number = sc.nextInt();


        //for loop
        for (i = 2; i <= number / 2; i++) {
            //now you to put the condition in the if statement
            if (number %i == 0){
                count++;
                break;
            }
        }
        //now you to put the condition in the if statement
        if (count == 0 && number != 1) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not prime number");
        }
    }
}
