package Homework2.arrays;

import java.util.Scanner;

public class HomeworkArrays223 {
    public static void main(String[] args) {

        int[] myArray = arrayFromConsole();
        for (int i : myArray) {
            System.out.print(i + " ");

        }
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
        System.out.println();
        int j = newArray.length-1;
        while (j >= 0) {
            System.out.print(newArray [j]  + " ");
            j--;
        }

        return newArray;
    }

}

