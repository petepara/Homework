package homeworkJava.Second.Sort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeworkSort421 {

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

            bubbleSort(newArray);

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
           // for(int i:myArray){
          //      System.out.print(i + " ");
          // }
           System.out.println("Результат сортирвоки массива: ");
           System.out.println(arrayIntoString + " > " +  Arrays.toString(myArray)) ;
            return myArray;
        }
    }


