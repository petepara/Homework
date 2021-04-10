package homeworkJava.SiteLoader;

import java.time.LocalDate;

/**
 * Загрузчик курса с сайта Нац. Банка
 */
public class NBRBLoader extends SiteLoader{
    int firstIndexToMinus=8, secondIndexToMinus = 2;

    /**
     * Метод для запуска загрузки курса валют
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    public double load(SiteLoader.Currency currencyName) {
        return load("https://www.nbrb.by/api/exrates/rates/" + currencyName.getId()+"?ondate=", currencyName);
    }

    /**
     * Обработка результата загрузки с сайта банка
     * @param content то что получилось загрузить
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    protected double handle(String content, SiteLoader.Currency currencyName) {
           return Double.parseDouble(content.substring(content.length()-firstIndexToMinus, content.length()-secondIndexToMinus));
    }
}
