package homeworkJava.Second.arrays;

import java.util.Scanner;

public class CreateArrayFromConsole {
    public static void main(String[] args) {
        int [] myArray = arrayFromConsole();
    }

    public static int[] arrayFromConsole(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input size of array: ");
        int num = input.nextInt();
        int [] newArray = new int [num];
        System.out.print("Input array numbers (" + num + "): ");
        for (int i = 0; i < newArray.length; i++) {
            System.out.println("Введите " + i + "-ый компонет массива newArray");
            newArray[i] = input.nextInt();
        }
        return newArray;
    }
}
