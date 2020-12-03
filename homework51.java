package homeworkJava;


import java.util.Scanner;

public class homework51 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя:");
        String enteredName = in.nextLine();
        switch(enteredName){
            case "Вася":
                System.out.println("Привет!\nЯ тебя так долго ждал.");
                break;
            case "Анастасия":
                System.out.println("Я тебя так долго ждал.");
                break;
            default:
                System.out.println("Добрый день, а вы кто?");
        }

    }

}


