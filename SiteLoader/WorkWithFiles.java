package homeworkJava.SiteLoader;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.EnumSet;

import static homeworkJava.SiteLoader.SiteLoader.*;
import static java.nio.file.attribute.PosixFilePermission.*;

public class WorkWithFiles {
    public static void writeToFile(String path, String fileName, double currency, Currency currencyName){
        File file;

        if(path == null|| path.isEmpty()){
            file = Path.of("src","homeworkJava", "resources", fileName + ".txt").toFile();
        }
        else{
            file = new File(path +"\\"+ fileName + ".txt");
        }

        try  (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file, true))){
            fileWriter.append("Курс " + currencyName + "= " + currency + "\n");
            fileWriter.newLine();

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Файл не найден");
        }
    }
}
