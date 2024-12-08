import java.util.*;

public class cal {
    public static void main(String args[]) {
        //taking the input for a and b with sc = new scanner
        Scanner sc = new Scanner(System.in); 

        System.out.println("Enter two number");
        //taking int a,b for storing value in int
        int a = sc.nextInt();
        int b = sc.nextInt();

        //print the option for add,sub,mult,div and using int choice for for storing value
        System.out.println("enter the option(1 for addition, 2 for substraction, 3 for multiplication, 4 for divisition)");
        int choice = sc.nextInt();

        //using switch for choice 1 to print case 1 to 4 & break statement used for end the loop
        switch(choice) {
            case 1 : 
                System.out.println("sum: " + (a + b));
                break;
            case 2 :
                System.out.println("sub:" + (a - b));
                break;
            case 3 :
                System.out.println("mult:" + (a * b));
                break;
            case 4 :
                System.out.println("div:" + (a / b));
                break;
            //if no choice are correct the input will display the below line
            default : System.out.println("invalid option");
        }
    }
}