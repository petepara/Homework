package homeworkJava;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import java.util.Scanner;
//дорабатывается?
public class homework6 {
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);

        int[] numbersForPhone =new int[10];
        System.out.println("Insert array elements(from 0 to 9):");

        for (int i = 0; i < numbersForPhone.length; i++) {
            numbersForPhone[i] = in.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        String newPhoneNumber = createPhoneNumber(numbersForPhone);
        System.out.println(newPhoneNumber);

    }
    public static String createPhoneNumber(int[] numbersArray) throws ParseException {


        String phoneNumber = "";
        for (int value : numbersArray) {
            phoneNumber = String.format("%s%s", phoneNumber, value);
        }
        String phoneMask = "(###)-###-####";
        MaskFormatter maskFormatter= new MaskFormatter(phoneMask);
        maskFormatter.setValueContainsLiteralCharacters(false);
        phoneNumber = maskFormatter.valueToString(phoneNumber);
        System.out.println();
        return phoneNumber;
        }
}
