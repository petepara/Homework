package homeworkJava.Second.Sort;

import homeworkJava.Second.arrays.CreateArrayFromConsole;
import homeworkJava.Second.arrays.CreateArrayRandom;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BubbleSortClass {

        public static void main(String[] args) {
            int[] newArray1 = {1,2,3,4,5,6};
            int[] newArray2 = {1,1,1,1};
            int[] newArray3 = {9,1,5,99,9,9};
            int[] newArray4 = {};

            bubbleSort(newArray1);
            bubbleSort(newArray2);
            bubbleSort(newArray3);
            bubbleSort(newArray4);

            /* Создание массива рандомной длины и рандомными числами */
            Scanner input = new Scanner(System.in);
            System.out.print("Input size of array: ");
            int size = input.nextInt();
            System.out.print("Input max value in array: ");
            int maxValue = input.nextInt();
            int[]newArray = CreateArrayRandom.arrayRandom(size,maxValue);
            bubbleSort(newArray);

            /* Создание массива длины и числами, введёнными пользователем через консоль */
            int [] newArray5 = CreateArrayFromConsole.arrayFromConsole();
            System.out.println();
            bubbleSort(newArray5);
        }
        public static int[] bubbleSort(int[] myArray){
            String arrayIntoString = Arrays.toString(myArray); // Переменная для сохранения изначального неотсориторванного массива
            boolean isSorted = false;   // Переменная, для определения отсортирован массив или нет
            int temp;                   // Переменная для обмена значениями элементов массива
            /* Пузырьковая сортировка */
            while(!isSorted) {   // Пока массив не отсортирован
                for (int i = 0; i < myArray.length-1; i++) {  // будет проходить до length-1, потому что после первого прохождения цикла, в конце массива будет самое большое число
                    if(myArray[i] > myArray[i+1]){    // Каждый элемент массива сравниваем со следующим, если значение i-го элемента больше значения i+1 элемента
                        temp = myArray[i];            // меняем местами значения  i-го элемента и i+1 элемента
                        myArray[i] = myArray[i+1];
                        myArray[i+1] = temp;
                    }
                }
                isSorted = true; // Предполагаем, что массив отсортирован
            }
            System.out.println("Результат сортирвоки массива: ");
            System.out.println(arrayIntoString + " > " +  Arrays.toString(myArray)) ;
            return myArray;
        }
    }


