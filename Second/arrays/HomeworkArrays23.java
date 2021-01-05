package homeworkJava.Second.arrays;

import java.util.Random;
import java.util.Scanner;

public class HomeworkArrays23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input size of array: ");
        int size = input.nextInt();
        System.out.print("Input max value in array: ");
        int maxValue = input.nextInt();
        arrayRandom(size, maxValue);
    }

    public static int[] arrayRandom(int size, int maxValueExclusion){
        Random rand = new Random();
        int[]newArray = new int [size];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = rand.nextInt(maxValueExclusion);
        }
        for(int j : newArray){
            System.out.print(j + " ");
        }
        return newArray;
    }


}

