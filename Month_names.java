import java.util.Scanner;
//Create first class
public class Month_names {

    //call the scanner
    Scanner month = new Scanner(System.in);
//printing month name for the given number
    public void switchMonth(){
        //acknowledge the user what to enter
        System.out.println("Enter any month's number from 1 to 12");
        //specifying month
        int number = month.nextInt();

        //Switch statement
        switch (number){
            //case statements within the switch block
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("february");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("Auguest");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid Entry");
        }
    }

    //Main method
    public static void main(String[] args) {
        //creating class object to call non-static method in static area
        Month_names monthNames = new Month_names();
        //calling method using class object
        monthNames.switchMonth();
    }
}
