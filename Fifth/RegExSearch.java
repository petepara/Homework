package homeworkJava.Fifth;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {

    @Override
    public long search(String text, String word) {
        int count = 0;
        String textToLowerCase = text.toLowerCase();
        String wordToLowerCase = word.toLowerCase();

        Pattern pattern = Pattern.compile("[\n.,:;!?\s()]" + wordToLowerCase + "[\n.,:;!?\s()]");

        Matcher matcher = pattern.matcher(textToLowerCase);
        while(matcher.find()){
           count++;
        }
        return ++count;

    }
}
