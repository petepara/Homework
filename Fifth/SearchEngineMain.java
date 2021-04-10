package homeworkJava.Fifth;

import java.io.IOException;
import java.util.Scanner;

public class SearchEngineMain {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String fileName = "src/homeworkJava/Fifth/resources/Война и мир_книга.txt";

        ISearchEngine searchWord = new RegExSearch();
        ISearchEngine searchEngine = new SearchEnginePunctuationNormalizer(searchWord);
        String myText = UniqueWordsClass.readUsingFiles(fileName);
        System.out.println(myText);
        myText = ((SearchEnginePunctuationNormalizer)searchEngine).deletePunctuation(myText);
        System.out.println(myText);
        myText = ((SearchEnginePunctuationNormalizer)searchEngine).deletePunctuation(myText);

        System.out.println(myText);
        System.out.println("---------------");
    }
}

