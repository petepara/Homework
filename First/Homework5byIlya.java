package homeworkJava.First;


import java.util.Objects;
import java.util.Scanner;

public class Homework5byIlya {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя:");
        String enteredName = in.nextLine();
        String friend = "Вася";
        String girlfriend = "Анастасия";
        if(Objects.equals(enteredName,girlfriend)) {
            System.out.println("Я тебя так долго ждал.");
            return;
        }
        if (Objects.equals(enteredName,friend)) {
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал.");
        }
        if (!Objects.equals(enteredName,girlfriend) &&!Objects.equals(enteredName,friend)) {
            System.out.println("Добрый день, а вы кто?");
        }

    }
}






