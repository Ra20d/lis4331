import java.util.InputMismatchException;
import java.util.Scanner;

public class testing5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double radius = 0;

        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.printf("Enter the radius of the circle: ");
                radius = input.nextDouble();
                validInput = true; 
            } catch (InputMismatchException e) {
                System.out.printf("Not a valid number!\n Please try again.");
                input.nextLine(); 
            }
        }

        input.close();

        
        double diameter = 2 * radius;
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);

        System.out.printf("Circle diameter: %.2f\n", diameter);
        System.out.printf("Circumference: %.2f\n", circumference);
        System.out.printf("Area: %.2f\n", area);
    }
}