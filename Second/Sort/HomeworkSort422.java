package homeworkJava.Second.Sort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeworkSort422 {
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
        Random rand = new Random();
        int maxValue = rand.nextInt();

        while(maxValue<=0){
            maxValue = rand.nextInt();
        }
        int size = rand.nextInt(30);
        //while(size<=0){
        // size = rand.nextInt();
        //}

        int[]newArray = new int [size];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = rand.nextInt(maxValue);
        }

        shakeSort(newArray);
        /* Создание массива длины и числами, введёнными пользователем через консоль */
        Scanner input = new Scanner(System.in);
        System.out.print("Input size of newArray5: ");
        int num = input.nextInt();
        int [] newArray5 = new int [num];
        System.out.print("Input newArray5 numbers (" + num + "): ");
        for (int i = 0; i < newArray5.length; i++) {
            System.out.println("Введите " + i + "-ый компонет массива newArray5");
            newArray5[i] = input.nextInt();
        }

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
