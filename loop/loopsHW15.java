package Homework2.loop;

import java.util.Scanner;

// добавить комменты
public class loopsHW15 {
    public static void main(String[] args) {

        for(int i = 1 ;i<=10;i++) {

            for(int j=1;j<=10 ;j++) {
                System.out.print(j + " x " + i + " = "  +(i*j) + "\t");

            }

            System.out.println();
        }
    }
}
