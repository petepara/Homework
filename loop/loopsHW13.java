package Homework2.loop;

import java.util.Scanner;

// добавить комменты
public class loopsHW13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number to elevate:");
        String numberToElevateS = input.nextLine();
        System.out.println("Input a rank of elevation:");
        String rankOfElevationS = input.nextLine ();
        int rankOfElevation;
        int numberToElevate;
        double numberToElevateD;

        while (!isDigit(rankOfElevationS) || rankOfElevationS.contains(".") || rankOfElevationS.contains(",")||rankOfElevationS.contains("-")) {
        System.out.println("Степень должна быть целым и положительным числом! Попробуй ещё раз:");
        rankOfElevationS = input.nextLine ();
        }
        rankOfElevation = Integer.parseInt(rankOfElevationS);
        if(numberToElevateS.contains(".") || numberToElevateS.contains(",")){
            numberToElevateD  = Double.parseDouble(numberToElevateS);
            System.out.println(powD(numberToElevateD,rankOfElevation));
        }
        else {
            numberToElevate = Integer.parseInt(numberToElevateS);
            System.out.println(pow(numberToElevate, rankOfElevation));
        }


   }
    public static int pow(int value, int powValue) {
        int result = 1;
        for (int i = 1; i <= powValue; i++) {
            result = result * value;
        }
        return result;
    }
    public static double powD(double value, int powValue) {
        double result = 1;
        for (int i = 1; i <= powValue; i++) {
            result = result * value;
        }
        return result;
    }
    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            int rankOfElevation =Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }



}
