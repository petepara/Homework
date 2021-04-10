package homeworkJava.Second.arrays;

import java.util.Random;
import java.util.Scanner;

public class ArrayTasks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input size of array: ");
        int size = input.nextInt();
        System.out.print("Input max value in array: ");
        int maxValue = input.nextInt();
        int [] myArray = arrayRandom(size, maxValue);
        System.out.println();
        System.out.println(sumEvenElements(myArray));
        System.out.println(maxArrayElement(myArray));
        lessAverageElements(myArray);
        System.out.println();
        twoMinNumbers(myArray);
        int [] newArray = delNumbersFromInterval(myArray);
        for(int i : newArray){
            System.out.print( i + "  ");
        }
        System.out.println();
        System.out.println("Сумма цифр всех элементов массива myArray " + getSumOfArrayDigits(myArray));
        System.out.println("Сумма цифр всех элементов массива newArray " + getSumOfArrayDigits(newArray));

    }

    public static int[] arrayRandom(int size, int maxValueExclusion) {
        Random rand = new Random();
        int[] newArray = new int[size];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = rand.nextInt(maxValueExclusion);
        }
        for (int j : newArray) {
            System.out.print(j + " ");
        }
        return newArray;
    }
    /* 2.4.1 Сумма четных положительных элементов массива */
    public static int sumEvenElements(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && array[i] % 2 == 0) {
                sum = sum + array[i];
            }
        }
        System.out.println("Сумма четных положительных элементов массива равна: " + sum);
        return sum;
    }
    /* 2.4.2. Максимальный из элементов массива с четными индексами */
    public static int maxArrayElement(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i += 2) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Максимальное число из элементов с четными индексами: " + max);
        return max;
    }
    /* 2.4.3. Элементы массива, которые меньше среднего арифметического */
    public static void lessAverageElements(int[] array) {
        int sum = 0;
        double avg = 0;
        for (int i = 1; i < array.length; i++) {
            sum += array[i];
        }
        avg = (double) (sum / array.length);
        System.out.println("Элементы массива ниже среднеарифметического значения: ");
        for (int i : array) {
            if (i < avg) {
                System.out.print(i + "  ");
            }
        }
    }
    /* 2.4.4. Найти два наименьших (минимальных) элемента массива */
        public static void twoMinNumbers ( int[] array){
            int minA = array[0];
            int minB = array[1];
            for (int i = 2; i < array.length; i++) {
                if (!(array[i] > minA) || !(array[i] > minB)) {
                    if (minB < minA) {
                        minA = array[i];
                    } else {
                        minB = minA;
                        minA = array[i];
                    }
                }
            }
            System.out.println("Два минимальных значения массива: " + minA + " , " + minB);
        }
    /* 2.4.5. Удалить элементы, принадлежащие интервалу. Длина массива остаётся прежней. */
    public static int[] delNumbersFromInterval(int [] array){
        int a = 5;
        int b = 9;
        int[] B = new int[array.length];
        for (int i = 0, j = 0; i < array.length; i++){
            if (array[i] < a || array[i] > b){
                B[j++] = array[i];
            }
        }
        return B;
    }

    /* 2.4.6. Сумма цифр массива */
    public static int getSumOfArrayDigits(int [] array){

        int sumDigits = 0;

        for(int i = 0; i<array.length; i++){
            while (array[i] > 0){
                sumDigits += array[i]%10;
                array[i]/=10;
            }
        }
        return sumDigits;
    }

}


