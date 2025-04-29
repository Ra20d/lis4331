import java.util.Scanner;

public class Methods {
    public static void getRequirements(){
        System.out.println("Program converts inches to centimeters, meters, feet, yards, and miles.");
        System.out.println("***Notes***:"
            + "\n1) Use interger for inches (must validate integer input)."
            + "\n2) Use printf() function to print (format values per below output)."
            + "\n3) Create Java \"comstants\" for the following values:"
            + "\n\tINCHES_TO_CENTIMETER,"
            + "\n\tINCHES_TO_METER,"
            + "\n\tINCHES_TO_FOOT,"
            + "\n\tINCHES_TO_YARD,"
            + "\n\tFEET_TO_MILE\n");
    }
    public static void measurementConversion(){
        int inches=0;
        double centimeters=0.0;
        double meters=0.0;
        double feet=0.0;
        double yards=0.0;
        double miles=0.0;

        final double INCHES_TO_CENTIMETER = 2.54;
        final double INCHES_TO_METER = .0254;
        final double INCHES_TO_FOOT = 12;
        final double INCHES_TO_YARD = 36;
        final double FEET_TO_MILE = 5280;
        Scanner input = new Scanner(System.in);
        System.out.print("Please eneter number of inches: ");
        while (!input.hasNextInt()){
            System.out.println("Not valid interger!\n");
            input.next();
            System.out.print("Please eneter number of inches: ");
        }
        inches = input.nextInt();

        centimeters = inches * INCHES_TO_CENTIMETER;
        meters = inches * INCHES_TO_METER;
        feet = inches / INCHES_TO_FOOT;
        yards = inches / INCHES_TO_YARD;
        miles = feet / FEET_TO_MILE;

    }
}
