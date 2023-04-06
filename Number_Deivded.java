import java.util.Scanner;
//first create class
public class Number_Deivded {
//main method
    public static void main(String[] args) {
        //create the scanner class
        Scanner sc = new Scanner(System.in);
        //number divide by 3
       System.out.println("Divided by 3: ");
        int i = sc.nextInt();
    //statement or code to be executed
         for (i = 1; i < 100; i++)
        {
            //condition for statement
            if (i % 3 == 0)
                System.out.print(i + ", ");
        }
        System.out.println();
        //number divide  by 5
       System.out.println("Divided by 5: ");
        //statement or code to be executed
        for (i = 1; i < 100; i++)
        {
            //condition for statement
            if (i % 5 == 0)
                System.out.print(i + ", ");
        }
        System.out.println();
    }

}
