package homeworkJava.Fifth;

import java.io.IOException;
import java.util.Scanner;

public class SearchEngineMain {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String fileName = "src/homeworkJava/resources/Война и мир_книга.txt";
        System.out.println("Enter the word you want to find (in russian): ");
        String wordToFind = sc.nextLine();

        ISearchEngine searchWord = new RegExSearch();
        ISearchEngine searchEngine = new SearchEnginePunctuationNormalizer(searchWord);
        String myText = SetHM21.readUsingFiles(fileName);
        System.out.println(myText);
        myText = ((SearchEnginePunctuationNormalizer)searchEngine).deletePunctuation(myText);
        System.out.println(myText);
        myText = ((SearchEnginePunctuationNormalizer)searchEngine).deletePunctuation(myText);
        searchWord.search(myText, wordToFind);
        System.out.println(myText);
        System.out.println("---------------");

        System.out.println("The word \"" + wordToFind + "\" was used "  + searchWord.search(myText,wordToFind) + " times");
        //MapHW22.printMap(MapHW22.sortByValue(myMapa));
    }
}

