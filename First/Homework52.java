package homeworkJava.First;


import java.util.Objects;
import java.util.Scanner;

public class Homework52 {
    public static void main(String[] args) {
// сравнение через if
        String nameVasya = "Вася";
        String nameAnastasiya = "Анастасия";
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя:");
        String enteredName = in.nextLine();
        if(enteredName.equals(nameAnastasiya)) {
            System.out.println("Я тебя так долго ждал.");
            return;

        }
        if (Objects.equals(enteredName,nameVasya)) {
            System.out.println("Привет!\nЯ тебя так долго ждал.");
            return;
        }
        if (!Objects.equals(enteredName, nameVasya)&&!Objects.equals(enteredName, nameAnastasiya)) {
            System.out.println("Добрый день, а вы кто?");
        }

    }
}


