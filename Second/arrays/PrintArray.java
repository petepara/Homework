package homeworkJava.Second.arrays;

import static homeworkJava.Second.arrays.CreateArrayFromConsole.arrayFromConsole;

public class PrintArray {
    public static void main(String[] args) {
        int[] myArray = arrayFromConsole();
        printArray(myArray);
        printEverySecondElement(myArray);
        printReverseArray(myArray);
    }

    public static void printArray(int [] array){
        for (int v : array) {
            System.out.print(v + " ");
        }
        System.out.println();
    }
    public static void printEverySecondElement(int [] array){
        for (int i = 1; i < array.length;i+=2 ) {
            System.out.print(array [i] + " ");
        }
        System.out.println();
    }
    public static void printReverseArray(int [] array){
        int j = array.length-1;
        while (j >= 0) {
            System.out.print(array [j]  + " ");
            j--;
        }
        System.out.println();
    }
}
