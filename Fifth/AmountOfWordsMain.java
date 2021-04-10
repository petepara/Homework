package homeworkJava.Fifth;

import java.io.IOException;
import java.util.Map;

import static homeworkJava.Fifth.AmountOfWordsClass.convertTextToMap;
import static homeworkJava.Fifth.UniqueWordsClass.convertStringToArray;
import static homeworkJava.Fifth.UniqueWordsClass.deletePuncMarks;

public class AmountOfWordsMain {
    public static void main(String[] args) throws IOException {

        String fileName = "src/homeworkJava/Fifth/resources/Война и мир_книга.txt";

        Map<String,Integer> myMapa = convertTextToMap(convertStringToArray(deletePuncMarks(fileName)));
        myMapa = AmountOfWordsClass.sortByValue(myMapa);

        System.out.println(myMapa);

        AmountOfWordsClass.printTopWordsInMap(myMapa);



    }
}

