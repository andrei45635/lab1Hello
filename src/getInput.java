import java.util.InputMismatchException;
import java.util.Scanner;

public class getInput {
    public static void main(String[] args) {
        int a;
        float b;
        String s;

        Scanner in = new Scanner(System.in);
        try{
            System.out.println("Input a string: ");
            s = in.nextLine();
            System.out.println("You entered string " + s);

            System.out.println("Input an integer: ");
            a = in.nextInt();
            System.out.println("You entered integer " + a);

            System.out.println("Input a float: ");
            b = in.nextFloat();
            System.out.println("You entered float " + b);
        }catch (InputMismatchException e){
            System.out.println("Invalid input");
        }
    }
}
