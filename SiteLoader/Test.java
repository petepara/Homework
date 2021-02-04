package homeworkJava.SiteLoader;

import homeworkJava.SiteLoader.NBRBLoader;

public class Test {
    public static void main(String[] args) {
        printRatesNBRB(new NBRBLoader());
        System.out.println();
        printRatesAB(new ALPHALoader());

    }

    public static void printRatesNBRB(SiteLoader loader){
        System.out.println("Курс ЕВРО НБРБ:" + loader.load(SiteLoader.Currency.EUR));
        System.out.println("Курс РОССИЙСКИХ РУБЛЕЙ НБРБ:" + loader.load(SiteLoader.Currency.RUB));
        System.out.println("Курс ДОЛЛАРА США НБРБ:" + loader.load(SiteLoader.Currency.USD));
    }
    public static void printRatesAB(SiteLoader loader){
        System.out.println("Курс покупки ЕВРО в Альфабанке:" + loader.load(SiteLoader.Currency.EUR));
        System.out.println("Курс покупки 100 РОССИЙСКИХ РУБЛЕЙ в Альфабанке:" + loader.load(SiteLoader.Currency.RUB));
        System.out.println("Курс покупки ДОЛЛАРА США в Альфабанке:" + loader.load(SiteLoader.Currency.USD));
    }
}
