package homeworkJava.Fifth;


import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.util.*;

public class MapHW22 {

    public  static Map<String, Integer> convertTextToMap(String[] arrayString) {
        Map<String, Integer> wordsByAmount = new HashMap<>();
        for (String str : arrayString) {
            if (wordsByAmount.containsKey(str)) {
                wordsByAmount.put(str, wordsByAmount.get(str) + 1);
            } else {
                wordsByAmount.put(str, 1);
            }
        }

        return wordsByAmount;
    }
    public static Map <String, Integer> sortByValue(Map<String, Integer> unsortMap) {
        List<Map.Entry<String, Integer>> list = new LinkedList<>(unsortMap.entrySet());
        Collections.sort(list, (o1, o2) -> (o2.getValue()).compareTo(o1.getValue()));

        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }

    public  static <K, V> void printTopWordsInMap(Map<K, V> map) {
        int i = 0;
        Scanner sc = new Scanner (System.in);
        System.out.print("Input the amount of the most used words: ");
        int num = sc.nextInt();
        for (Map.Entry<K, V> entry : map.entrySet()) {

            if(i==num) {
                i =0;
                break;}
            System.out.println("Amount of using word \"" + entry.getKey() + "\" = " + entry.getValue());
            i++;
        }
    }
    public static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey()
                    + " Value : " + entry.getValue());
        }
    }

}
