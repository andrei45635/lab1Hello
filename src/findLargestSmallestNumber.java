import java.util.InputMismatchException;
import java.util.Scanner;

public class findLargestSmallestNumber {
    public static void main(String[] args){
        int a = 0,x = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Input array length: ");
        a = in.nextInt();

        int[] numbers = new int[a];

        for(int i = 0; i < a; i++){
            System.out.println("Input element:");
            x = in.nextInt();
            numbers[i] = x;
        }

        int small = numbers[0];
        int large = numbers[0];

        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] > large) large = numbers[i];
            else if(numbers[i] < small) small = numbers[i];
        }

        System.out.println("Smallest number in the array is: " + small);
        System.out.println("Largest number in the array is: " + large);
    }
}
