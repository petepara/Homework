package homeworkJava;


import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {
       // boolean weekday = false;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter day of the week(1-7):");
        int day = in.nextInt();
        while(day>7)
        {
            System.out.println("You entered wrong number. Enter day of the week(1-7):");
            day = in.nextInt();
        }
       boolean weekday = day >= 1 && day < 6 ? true : false;

        System.out.println("Are you on vacation?(1-yes;2-no):");
        int onVacation = in.nextInt();
        while(onVacation>2)
        {
            System.out.println("You entered wrong number. Enter 1 - yes or 2 - no:");
            onVacation = in.nextInt();
        }
        boolean vacation = onVacation == 1 ? true : false;

        boolean toSleepOrNot = sleepIn(weekday, vacation);
        if (toSleepOrNot) {
            System.out.println("You can continue sleeping!!!");
        }
        else {
            System.out.println("It's time to go to work!!!");
        }
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }
        else {
            return false;
        }
    }
}


