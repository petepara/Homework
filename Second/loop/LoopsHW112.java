package homeworkJava.Second.loop;

import java.util.Scanner;

public class LoopsHW112 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input any positive number:");
        long enteredNumber = input.nextLong();
        while (enteredNumber < 0 && enteredNumber > Long.MAX_VALUE) {
            System.out.println("It's wrong number! Try one more time:");
        }

        System.out.print("Вы ввели число: " + enteredNumber + "; ");
        System.out.println(factorial(enteredNumber));

    }
    static long factorial(long x){

        long result = 1;
        if (x == 0) {
            System.out.print(" = ");
            return result;
        }
        if (x == 1) {
            System.out.print(" * 1 = ");
            return result;
        }

        System.out.print(x);
        if (x != 2) {
            System.out.print(" * ");
        }
        try{
        result = x * factorial(x - 1);
        return result;
        }
        catch (StackOverflowError e){

        System.out.println("\n" + e + ". The value is more than long MAX VALUE!");
        return Long.MAX_VALUE;
        }

    }

}
