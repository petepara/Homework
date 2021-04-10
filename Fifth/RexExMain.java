package homeworkJava.Fifth;

import java.io.IOException;
import java.util.Scanner;

public class RexExMain {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String fileName = "src/homeworkJava/Fifth/resources/Война и мир_книга.txt";
        System.out.println("Enter the word you want to find (in russian): ");
        String wordToFind = sc.nextLine();

        ISearchEngine searchWord = new RegExSearch();
        String myText = UniqueWordsClass.readUsingFiles(fileName);

        System.out.println("---------------");

        System.out.println("The word \"" + wordToFind + "\" was used "  + searchWord.search(myText,wordToFind) + " times");

    }
}

