import java.util.Scanner;

public class testing {
    
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
    
            int count = 0;
            int total = 0;
    
    
            while (true) {
                System.out.printf("Enter a number: ");
    
                
                if (input.hasNextInt()) {
                    int number = input.nextInt();
    
                    if (number < 0 || number > 100) {
                        break; 
                    }
    
                    count++;
                    total += number;
                } else {
                    System.out.printf("Not valid number! \nPlease try again.");
                    input.next(); 
                }
            }
    
            input.close();
    
                double average = (double) total / count;
                System.out.printf("Count: " + count + "\n");
                System.out.printf("Total: " + total + "\n");
                System.out.printf("Average: %.1f\n", average);
             
        
        }
    }


