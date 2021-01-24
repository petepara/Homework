package homeworkJava.Fifth;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

import static homeworkJava.Fifth.MapHW22.convertTextToMap;
import static homeworkJava.Fifth.SetHM21.convertStringToArray;
import static homeworkJava.Fifth.SetHM21.deletePuncMarks;

public class RexExMain {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String fileName = "src/homeworkJava/resources/Война и мир_книга.txt";
        System.out.println("Enter the word you want to find (in russian): ");
        String wordToFind = sc.nextLine();

        ISearchEngine searchWord = new RegExSearch();
        String myText = SetHM21.readUsingFiles(fileName);

        System.out.println("---------------");

        System.out.println("The word \"" + wordToFind + "\" was used "  + searchWord.search(myText,wordToFind) + " times");
        //MapHW22.printMap(MapHW22.sortByValue(myMapa));
    }
}

