package homeworkJava.Second.arrays;

import java.util.Scanner;

public class HomeworkArrays222 {
    public static void main(String[] args) {

        int[] myArray = arrayFromConsole();
        for (int i : myArray) {
            System.out.print(i + " ");

        }
    }

    public static int[] arrayFromConsole(){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int num = input.nextInt();
        int [] newArray = new int [num];
        System.out.println("Введите значения массива(" + num + "): ");
        for (int i = 0; i < newArray.length; i++) {
            System.out.println("Введите " + i + "-ый элемент массива myArray");
            newArray[i] = input.nextInt();
        }
        System.out.println("Каждый 2-й элемент массива newArray");
        for (int i = 1; i < newArray.length;i+=2 ) {
            System.out.print(newArray [i] + " ");

        }
        System.out.println(" ");
        return newArray;
    }
}
