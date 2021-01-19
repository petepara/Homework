package homeworkJava.Fifth;


import java.io.IOException;
import java.util.*;


import static homeworkJava.Fifth.SetHM21.deletePuncMarks;


public class MapHW22 {
    public static void main(String[] args) throws IOException {

        String fileName = "C:\\Курсы\\Война и мир_книга.txt";
        convertTextToMap(deletePuncMarks(fileName));
    }

    private static Map<String, Integer> convertTextToMap(String[] arrayString) {
        Map<String, Integer> wordsByAmount = new HashMap<>();
        for (String str : arrayString) {
            if (wordsByAmount.containsKey(str)) {
                wordsByAmount.put(str, wordsByAmount.get(str) + 1);
            } else {
                wordsByAmount.put(str, 1);
            }
        }
        System.out.println(wordsByAmount);
        return wordsByAmount;
    }
}
