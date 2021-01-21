package homeworkJava.Fifth;


import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class SetHM21 {
    public static void main(String[] args) throws IOException {

        String fileName = "C:\\Курсы\\Война и мир_книга.txt";

        convertTextToSet(convertStringToArray(deletePuncMarks(fileName)));
    }

    public static String readUsingFiles(String file) throws IOException {
        return new String(Files.readAllBytes(Paths.get(file)));
    }

    public static String deletePuncMarks (String fileName) throws IOException {
        String text = readUsingFiles(fileName);
        text = text.replaceAll("\\s+-|\\s+-\\s+|-\\s+", " ");
        text = text.replaceAll("[^\\da-zA-Zа-яёА-ЯЁ0-9-]", " ");
        return text;
    }

    public static String[] convertStringToArray(String text){
        String [] S = text.split("[\\s,.!?]+");
        return S;
    }

    public static Set<String> convertTextToSet(String[] stringArray) throws IOException {
        Set<String> words = new HashSet<>(Arrays.asList(stringArray));
        System.out.println("Всего использовано " + words.size() + "уникальных слов");
        return words;
    }
}
