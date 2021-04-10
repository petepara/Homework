package homeworkJava.First;


import java.util.Scanner;

public class Homework51 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя:");
        String enteredName = in.nextLine();// Вводим имя через консоль
        switch (enteredName) {
            // В случае, если введённое имя совпадёт с "Вася",
            case "Вася" -> System.out.println("Привет!\nЯ тебя так долго ждал.");  // в консоль будет выведено данное сообщение
            // В случае, если введённое имя совпадёт с "Вася",
            case "Анастасия" -> System.out.println("Я тебя так долго ждал.");   // в консоль будет выведено данное сообщение
            //Во всех остальных случаях будет
            default -> System.out.println("Добрый день, а вы кто?");   //в консоль будет выведено данное сообшение
        }

    }

}


