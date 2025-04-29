import java.util.InputMismatchException;
import java.util.Scanner;

public class numbermultiple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int firstNumber = 0;
        int secondNumber = 0;

        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Num1: ");
                firstNumber = input.nextInt();
                validInput = true; 
            } catch (InputMismatchException e) {
                System.out.println("Not valid integer!");
                input.nextLine(); 
            }
        }

        validInput = false;
        while (!validInput) {
            try {
                System.out.print("Num2: ");
                secondNumber = input.nextInt();
                validInput = true; 
            } catch (InputMismatchException e) {
                System.out.println("Not valid integer!");
                input.nextLine(); 
            }
        }

        input.close();

        if (secondNumber != 0) {
            if (firstNumber % secondNumber == 0) {
                System.out.println(firstNumber + " is a multiple of " + secondNumber);
            } 

            int timesFit = firstNumber / secondNumber;
            System.out.println("The product of " + timesFit + " and " + secondNumber + " is " + firstNumber);
        }
    }
}
