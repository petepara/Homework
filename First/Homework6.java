package homeworkJava.First;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import java.util.Scanner;
//дорабатывается?
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
     * @throws ParseException
     */
    public static String createPhoneNumber(int[] numbersArray) throws ParseException {
      /*  String phoneNumber = "";
        for (int value : numbersArray) {
            phoneNumber = String.format("%s%s", phoneNumber, value);
        }
        String phoneMask = "(###)-###-####";
        MaskFormatter maskFormatter= new MaskFormatter(phoneMask);
        maskFormatter.setValueContainsLiteralCharacters(false);
        phoneNumber = maskFormatter.valueToString(phoneNumber);
        System.out.println();
        return phoneNumber;*/
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d",numbersArray[0], numbersArray[1], numbersArray[2],numbersArray[3],
                numbersArray[4], numbersArray[5], numbersArray[6], numbersArray[7], numbersArray[8], numbersArray[9]);
        }
}
