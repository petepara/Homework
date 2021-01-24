package homeworkJava.Fifth;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {

   //Доработать код
    @Override
    public long search(String text, String word) {
        int count = 0;
      // text = text.replaceAll("\s+-|\s+-\s+|-\s+", " ");
        //text = text.replaceAll("[^\\da-zA-Zа-яёА-ЯЁ0-9-]", " ");
        //TODO: этот вариант подсчитывает на одно слово меньше, необходимо доработать
        Pattern pattern = Pattern.compile("[\n.,:;!?\s()]" + word + "[\n.,:;!?\s()]");
     //   Pattern pattern = Pattern.compile(" " + word + " ");
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()){
           count++;
        }
        return count;

    }
}
