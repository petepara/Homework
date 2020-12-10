package Homework2.loop;

import java.util.Scanner;

// добавить комменты
public class loopsHW12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input any number:");
        String enteredNumberS = input.nextLine();
        while (!enteredNumberS.contains(".") || enteredNumberS.contains(",")) {
            System.out.println("Необходимо ввести целое число! Попробуй ещё раз:");
            enteredNumberS = input.nextLine ();
        }
        int enteredNumber = Integer.parseInt(enteredNumberS);
        numbersMultiply(enteredNumber);
        System.out.print("\nВы ввели число: " + enteredNumber + "!");

   }

    static int numbersMultiply(int  n) {

        String numberToText = String.valueOf(n);
        char[] resultToPrint = numberToText.toCharArray();
        int multiply = 1;
        int remainder;
        while (n != 0) {
            remainder = n % 10;
            multiply = multiply * remainder;
            n /= 10;

        }
        System.out.println("\n Произведение цифр введённого числа: " );
        for (int i = 0; i < resultToPrint.length-1; i++){
            System.out.print(resultToPrint[i] + "*");
        }
        System.out.print(resultToPrint[resultToPrint.length-1] + "=" + multiply);
                return multiply;
    }
}
