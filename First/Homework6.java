package homeworkJava.First;

import java.text.ParseException;
import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        int[] numbersForPhone =new int[10]; //создаём массив
        System.out.println("Insert array elements(from 0 to 9):");
        for (int i = 0; i < numbersForPhone.length; i++) {
            numbersForPhone[i] = in.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        String newPhoneNumber = createPhoneNumber(numbersForPhone);
        System.out.println(newPhoneNumber);

    }

    /**
     *
     * @param numbersArray принимает в параметр массив заполенный целочисленными значениями типа int
     *                     преобразует его в строку в формате (###)-###-####
     * @return возвращает телефонный номер с типом String в заданном формате
     */
    public static String createPhoneNumber(int[] numbersArray) throws ParseException {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d",numbersArray[0], numbersArray[1], numbersArray[2],numbersArray[3],
                numbersArray[4], numbersArray[5], numbersArray[6], numbersArray[7], numbersArray[8], numbersArray[9]);
        }
}
