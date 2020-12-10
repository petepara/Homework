package Homework2.loop;

import java.util.Scanner;
// добавить комменты
public class loopsHW {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Input any number:");
            int enteredNumber = input.nextInt();
            System.out.println(selfMultiply(enteredNumber));

        }
    public static int selfMultiply(int x){
        int result = 1;

        for(int i=1; i<= x;i++){
            result*=i;
        }

        return result;
    }

}
