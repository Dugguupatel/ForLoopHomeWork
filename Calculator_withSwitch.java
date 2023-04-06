import java.util.Scanner;
//first create class
public class Calculator_withSwitch {

    //Main method
    public static void main(String[] args) {

        char operator;
        double num1;
        double num2;
        double result;

        //create an object of Scanner class
        Scanner sc = new Scanner(System.in);
        //Ask user to enter numbers
        System.out.println("Choose an operator: +, -, *, or /");
        operator = sc.next().charAt(0);

        //Ask user to enter numbers
        System.out.println("Enter first number");
        num1 = sc.nextDouble();

        //Ask user to enter numbers
        System.out.println("Enter second number");
        num2 = sc.nextDouble();

        switch (operator){
            //perform addition between numbers
            case '+':
                result = num1 + num2;
                System.out.println(num1 +" + " + num2 + " = " + result);
                break;
                //perform subtraction between numbers
            case '-':
            result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
                //perform multiplication between numbers
            case  '*':
                result = num1*num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
               //perform division between numbers
            case  '/':
                result = num1/num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
                break;

            default:
                System.out.println("Invalid Entry");
                break;
        }














    }
}
