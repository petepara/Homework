package homeworkJava;

import java.util.Scanner;

public class homework5 {
    public static void main(String[] args) {

        String nameVasya = "Вася";
        String nameAnastasiya = "Анастасия";
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя:");
        String enteredName = in.nextLine();
        if (enteredName.equals(nameVasya)) {
            System.out.println("Привет!\nЯ тебя так долго ждал.");

        } else if (enteredName.equals(nameAnastasiya)) {
            System.out.println("Я тебя так долго ждал.");
        } else {
            System.out.println("Добрый день, а вы кто?");
        }

    }
}






