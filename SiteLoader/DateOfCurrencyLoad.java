package homeworkJava.SiteLoader;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class DateOfCurrencyLoad {
    public static List<LocalDate> getDatesForLoading(String datesString){
        Pattern pattern = Pattern.compile("!|\\s ");
        String [] dates;
        List<LocalDate> dateList = new ArrayList<>();
        String dateString = datesString.replace(",","!")
                                        .replace("-"," ");
        datesString = datesString.replace(".", "-");
        if(datesString.contains("!")){

            dates = pattern.split(datesString);
            for (int i = 0; i < dates.length; i++) {
                dates[i] = dates[i].replace(".","-");
                try{
                    dateList.add(LocalDate.parse(dates[i]));
                }
                catch (DateTimeParseException exception){
                    System.out.println(exception.getMessage() + "не удалось обработать введённую информацию.");
                }
            }
            return dateList;
        }
        else if(datesString.contains(" ")){
            dates = pattern.split(datesString);
            for (int i = 0; i < dates.length; i++) {
                dates[i] = dates[i].replace(".","-");
                try{
                    dateList.add(LocalDate.parse(dates[i]));
                }
                catch (DateTimeParseException exception){
                    System.out.println(exception.getMessage() + "не удалось обработать введённую информацию.");
                }
            }
        }
        return dateList;
    }
}
