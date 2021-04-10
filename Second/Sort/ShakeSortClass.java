package homeworkJava.Second.Sort;

import homeworkJava.Second.arrays.CreateArrayFromConsole;
import homeworkJava.Second.arrays.CreateArrayRandom;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ShakeSortClass {
    public static void main(String[] args) {
        int[] newArray1 = {1,2,3,4,5,6};
        int[] newArray2 = {1,1,1,1};
        int[] newArray3 = {9,1,5,99,9,9};
        int[] newArray4 = {};

        shakeSort(newArray1);
        shakeSort(newArray2);
        shakeSort(newArray3);
        shakeSort(newArray4);

        /* Создание массива рандомной длины и рандомными числами */
        Scanner input = new Scanner(System.in);
        System.out.print("Input size of array: ");
        int size = input.nextInt();
        System.out.print("Input max value in array: ");
        int maxValue = input.nextInt();
        int[]newArray = CreateArrayRandom.arrayRandom(size,maxValue);
        shakeSort(newArray);

        /* Создание массива длины и числами, введёнными пользователем через консоль */
        int [] newArray5 = CreateArrayFromConsole.arrayFromConsole();
        System.out.println();
        shakeSort(newArray5);
    }
    public static int[] shakeSort(int[] myArray){
        String arrayIntoString = Arrays.toString(myArray); // Переменная для сохранения изначального неотсориторванного массива
        int temp; // Переменная для обмена значениями элементов массива
        System.out.println();

        /*Сортировка Массива шейкером*/
        int leftSide = 0;
        int rightSide = myArray.length - 1;
        do {
            for (int i = leftSide; i < rightSide; i++) { // Сортир. влево ищем МАКС. знач.
                if (myArray[i] > myArray[i + 1]) {
                    temp = myArray[i];
                    myArray[i] = myArray[i + 1];
                    myArray[i + 1] = temp;
                }
            }
            rightSide--; // Уменьшаем количество проходов
            for (int i = rightSide; i > leftSide; i--) { // Теперь идём в обратную сторону ищем МИН.
                if (myArray[i] < myArray[i - 1]) {
                    temp = myArray[i];
                    myArray[i] = myArray[i - 1];
                    myArray[i - 1] = temp;
                }
            }
            leftSide++; // Уменьшаем количество проходов т.к. мы шли с конца исходя из условия
            // последнего for, чтобы уменьшить кол-во проходов нужно инкрементировать счётчик
        } while (leftSide < rightSide); //условие при котором будут происходить проходки
        System.out.println("Результат сортирвоки массива: ");
        System.out.println(arrayIntoString + " > " +  Arrays.toString(myArray)) ;
        return myArray;
    }
}
