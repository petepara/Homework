package homeworkJava.First;


import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter day of the week(1-7):");
        int day = in.nextInt(); //Вводим день недели через консоль
        while(day>7)            // если ввели значение больше 7,т.е. число большее, чем присвоены дням недели,
        {
            System.out.println("You entered wrong number. Enter day of the week(1-7):");// то будет выводиться данное сообщение
            day = in.nextInt();                                                         // и будет необходимо ввести значение снова
        }
        boolean weekday = day >= 1 && day < 6 ? true : false; // присваиваем значение типа boolean для определения будний это день или нет

        System.out.println("Are you on vacation?(1-yes;2-no):");
        int onVacation = in.nextInt(); // Определяем в отпуске или нет
        while(onVacation>2)             //повторяем ввод, если введенное значение не совпадает с существующими вариантами
        {
            System.out.println("You entered wrong number. Enter 1 - yes or 2 - no:");
            onVacation = in.nextInt();
        }
        boolean vacation = onVacation == 1 ? true : false;

        boolean toSleepOrNot = sleepIn(weekday, vacation);      //если метод sleepIn вернул true, то можно спать
        if (toSleepOrNot) {
            System.out.println("You can continue sleeping!!!"); // и выводим об этом сообщение
        }
        else {
            System.out.println("It's time to go to work!!!");   // иначе надо идти на работу, что и говорится в данном сообщении
        }
    }

    /**
     *
     * @param weekday определяет будний день или нет
     * @param vacation определяет в отпуске или нет
     * @return возвращает true, если не будний день или отпуск
     *          иначе возвращает false.
     */
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }
        else {
            return false;
        }
    }
}


