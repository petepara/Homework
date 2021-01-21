package homeworkJava.Fifth;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

import static homeworkJava.Fifth.MapHW22.convertTextToMap;
import static homeworkJava.Fifth.SetHM21.convertStringToArray;
import static homeworkJava.Fifth.SetHM21.deletePuncMarks;

public class MapMain {
    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Курсы\\Война и мир_книга.txt";

        Map<String,Integer> myMapa = convertTextToMap(convertStringToArray(deletePuncMarks(fileName)));

        MapHW22.printTopWordsInMap(MapHW22.sortByValue(myMapa));
        EasySearch word = new EasySearch();
        String myText = SetHM21.readUsingFiles(fileName);
        word.search(myText,"не");
        //MapHW22.printMap(MapHW22.sortByValue(myMapa));
    }
}

