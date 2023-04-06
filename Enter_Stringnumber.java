import java.util.Scanner;
//first create class
public class Enter_Stringnumber {

    //main method
    public static void main(String[] args) {

    //Create the object of class
    Scanner scanner = new Scanner(System.in);
        System.out.println("enter a");
        String str = scanner.nextLine();
        //input Variable
        String name = "patel";

        int count = 0;
        //statement or code to be executed
            for (int i = 0; i < str.length(); i++)
            {
                //condition of statement
                if (str.charAt(i) == 'a' || str.charAt(i) == 'A');
                count++;

            }
            //printing the string values
        System.out.println("Total number of 'a' in the given string is: " + count);
        }
    }

