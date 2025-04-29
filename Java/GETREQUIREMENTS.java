import java.util.Scanner;
public class GETREQUIREMENTS {
    public static void getRequirements() {
        System.out.println ("Author: Roman Avdei");
        System.out.println("Program converts seconds to minutes, hours, days, weeks, and (regular) years--365 days. ");
       
    }

    public static void convertTime(){
        int seconds=0;
        double minutes=0.0;
        double hours=0.0;
        double days=0.0;
        double weeks=0.0;
        double years=0.0;

        final double SECS_IN_MINS = 60;
        final double MINS_IN_HR = 60;
        final double HRS_IN_DAY = 24;
        final double DAYS_IN_WEEK = 7;
        final double DAYS_IN_YR = 365;

        Scanner sc = new Scanner(System.in);


while (true){
    System.out.println("Please eneter number of seconds: ");
    if(Scanner.hasNextInt()){
        int number = Scanner.nextInt();
        if (number <0 || number >100000000){
            break;
        }

        seconds++;
        minutes += number;

    }
    else {
        System.out.println( "Not valid integer!");
        scanner.next();
    }


}

sc.close();

      if (seconds > 0){
        System.out.println("Enter number of seconds: ");

      }
    }
}
