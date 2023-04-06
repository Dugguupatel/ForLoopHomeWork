import java.util.Scanner;
//first create class
public class SumOf_Natural_number {

    //main method
    public static void main(String[] args) {

        int sum = 0;

        //object of scanner class
        Scanner sc = new Scanner(System.in);
        //acknowledge the user what to enter
        System.out.println("Sum from: ");

        //takes an integer as input
        int num = sc.nextInt();
        //acknowledge the user what to enter
        System.out.println("Sum up to: ");

        //execute the value of 'i' into sum variable
        for (int i = 1; i <= num; i++) {
            //increments the value of 'i' by 1
            System.out.println("i= "+i);
            //adding the value of 'i' into sum variable
            System.out.println("Sum "+(sum+=i));
        }
        //print the sum
         System.out.println("sum of "+num+ "natural numbers= " +sum);

    }
}
