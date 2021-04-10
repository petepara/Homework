package homeworkJava.Second.loop;

import java.util.Scanner;

public class LoopsHW {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input any positive number:");
        long enteredNumber = input.nextLong();
        while (enteredNumber < 0 && enteredNumber > Long.MAX_VALUE) {
            System.out.println("It's wrong number! Try one more time:");
        }
            selfMultiply(enteredNumber);
        }
    public static long selfMultiply(long x){
        long result = 1;
        long resultCheck;
        for(int i=1; i <= x;i++){
            result *= i;
            if(i<x){
                System.out.print(i + "  ");
            }
            if(i!=x &&  result * (i + 1) < 0){
                System.out.println("* " + (i+1) + " is already more than " + Long.MAX_VALUE);
                System.out.println("Factorial " + x + " is more than " + Long.MAX_VALUE);
                System.out.println("Overflow occured");
                System.out.println("The number before overflow is " + result);
                return result;
            }
            if(i<x){
                System.out.print("* ");
            }
            if(i==x){
                System.out.print(i + " = " + " " + result);
            }
        }
        return result;
    }

}
