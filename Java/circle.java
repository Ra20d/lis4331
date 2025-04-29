import java.util.Scanner;

public class circle {
public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int radius=0;
    float diameter;
    double circumference ;
    double area;
    double Pi;

    Pi= 3.14;

    System.out.print("Enter radius value:");
    radius=input.nextInt();

    area = (radius*radius*Pi);
    circumference =(radius*2*Pi);
    diameter = (radius*2);





    System.out.printf("Circle diameter: %.2f" , diameter);
    System.out.printf("\nCircumference: %.2f" , circumference);
    System.out.printf("\nArea: %.2f" , area);
 }
}

