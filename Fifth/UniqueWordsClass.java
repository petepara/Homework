package homeworkJava.Fifth;


import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class UniqueWordsClass {
    /* 1.1.*/
    /**
     *
     * @param file принимает строку, в которой указан путь к файлу
     * @return возвращает строку, в которую помещен текст из файла
     * @throws IOException
     */
    public static String readUsingFiles(String file) throws IOException {
        return new String(Files.readAllBytes(Paths.get(file)));
    }

    /**
     *
     * @param fileName принимает строку, в которой указан путь к файлу;
     *                 преобразует текст из файла в строку;
     *                 удаляет все знаки препинания из содержимого строки
     * @return         возвращает строку, содержащую текст без знаков препинания
     * @throws IOException
     */
    public static String deletePuncMarks (String fileName) throws IOException {
        String text = readUsingFiles(fileName);
        text = text.replaceAll("\s+-|\s+-\s+|-\s+", " ");
        text = text.replaceAll("[^\\da-zA-Zа-яёА-ЯЁ0-9-]", " ");
        return text;
    }
    /**
     *
     * @param text принимает строку, которую преобразует в массив;
     * @return массив строк
     */
    public static String[] convertStringToArray(String text){
        String [] S = text.split("[\\s,.!?]+");
        return S;
    }
    /**
     *
     * @param stringArray принимает массив строк;
     *                    преобразует в коллекцию HashSet;
     *                    выводит информацию о количестве уникальных использованных слов;
     * @return            коллекцию, содержащую все уникальные слова в массиве строк
     * @throws IOException
     */
    public static Set<String> convertTextToSet(String[] stringArray) throws IOException {
        Set<String> words = new HashSet<>(Arrays.asList(stringArray));
        System.out.println("Всего использовано " + words.size() + " уникальных слов");
        return words;
    }
}
