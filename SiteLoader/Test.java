package homeworkJava.SiteLoader;

import java.util.Scanner;

import static homeworkJava.SiteLoader.SiteLoader.*;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        printRatesNBRB(new NBRBLoader());
        System.out.println();
        printRatesAB(new AlphaLoader());
        System.out.println();
        System.out.println("Введите путь для для расположения файла: ");
        String pathToSaveFile = sc.nextLine();
        System.out.println("Введите введите название файла: ");
        String fileName = sc.nextLine();
        WorkWithFiles.writeToFile(pathToSaveFile, fileName, new NBRBLoader().load(Currency.EUR), Currency.EUR);
    }

    public static void printRatesNBRB(SiteLoader loader){
        System.out.println("Курс ЕВРО НБРБ:" + loader.load(Currency.EUR));
        System.out.println("Курс РОССИЙСКИХ РУБЛЕЙ НБРБ:" + loader.load(Currency.RUB));
        System.out.println("Курс ДОЛЛАРА США НБРБ:" + loader.load(Currency.USD));
    }
    public static void printRatesAB(SiteLoader loader) {
        System.out.println("Курс покупки ЕВРО в Альфабанке:" + loader.load(Currency.EUR));
        System.out.println("Курс покупки 100 РОССИЙСКИХ РУБЛЕЙ в Альфабанке:" + loader.load(Currency.RUB));
        System.out.println("Курс покупки ДОЛЛАРА США в Альфабанке:" + loader.load(Currency.USD));
    }

}
