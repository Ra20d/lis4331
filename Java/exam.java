import java.util.Scanner;
public class exam {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
    
            int count = 0;
            int total = 0;
    
            while (true) {
                System.out.print("Enter a number: ");
    
                
                if (input.hasNextInt()) {
                    int number = input.nextInt();
    
                    if (number < 0 || number > 100) {
                        break; 
                    }
    
                    count++;
                    total += number;
                } else {
                    System.out.println("Not a valid number! \nPlease try again.");
                    input.next(); 
                }
            }

            input.close();
    
            if (count > 0) {
                double average = (double) total / count;
                System.out.println("Count: " + count);
                System.out.println("Total: " + total);
                System.out.printf("Average: %.2f\n", average);
            } else {
                System.out.println("No valid numbers entered.");
            }
        }
    }