package homeworkJava.First;

import java.util.Objects;
import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
//Сравнение через if else if
        String nameVasya = "Вася";
        String nameAnastasiya = "Анастасия";
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя:");
        String enteredName = in.nextLine(); // вводим имя через консоль

        if (Objects.equals(enteredName,nameVasya)) {                        //если совпадает с переменной nameVasya,
            System.out.println("Привет!\nЯ тебя так долго ждал.");  // выводится это сообщение

        }
        else if (Objects.equals(enteredName,nameAnastasiya)) { //если совпадает с переменной nameAnastasiya,
            System.out.println("Я тебя так долго ждал.");// выводится это сообщение
        } else {
            System.out.println("Добрый день, а вы кто?"); //во всех остальных случаях выводится это сообщение
        }

    }
}






