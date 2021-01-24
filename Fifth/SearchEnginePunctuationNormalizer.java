package homeworkJava.Fifth;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchEnginePunctuationNormalizer implements ISearchEngine {

    private ISearchEngine searchEngine;
    public SearchEnginePunctuationNormalizer(ISearchEngine searchEngine){
        this.searchEngine = searchEngine;
    }

    @Override
    public long search(String text, String word) {
        int count = 0;
        Pattern pattern = Pattern.compile(" " + word + " ");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            count++;
        }
        return count;
    }
    public String deletePunctuation(String text1){
            Scanner in = new Scanner(System.in);

            System.out.println("Enter the symbol you want to delete:");
            String deletedChar = in.nextLine();

            text1 = text1.replaceAll("\s+"+deletedChar+"|\s+"+deletedChar+"\s+|"+deletedChar+"\s+", " ");
            return text1;


    }
}
