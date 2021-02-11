package homeworkJava.SiteLoader;

import java.time.LocalDate;

/**
 * Загрузчик курса с сайта Нац. Банка
 */
public class ALPHALoader extends SiteLoader{

    /**
     * Метод для запуска загрузки курса валют
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    public double load(Currency currencyName, LocalDate localDate) {
        return load("https://developerhub.alfabank.by:8273/partner/1.0.0/public/rates", currencyName);
    }

    /**
     * Обработка результата загрузки с сайта банка
     * @param content то что получилось загрузить
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли, если валюта не найдена, возвращается число -999
     */
    @Override
    protected double handle(String content, Currency currencyName) {
        String substring1 = currencyName.toString();
        String substring2 = "BYN";
        String[] lines = content.split("0Z\"},");

        for (int i = 0; i < lines.length; i++) {
            if (lines[i].contains(substring1) && lines[i].contains(substring2)) {
                return Double.parseDouble(lines[i].substring(lines[i].indexOf(substring2) - 19, lines[i].indexOf(substring2) - 15));
            }
        }
        return -999;

    }
}
