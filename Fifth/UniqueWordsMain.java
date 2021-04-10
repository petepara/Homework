package homeworkJava.Fifth;


import java.io.IOException;


import static homeworkJava.Fifth.UniqueWordsClass.*;

public class UniqueWordsMain {
    public static void main(String[] args) throws IOException {

         String fileName = "src/homeworkJava/Fifth/resources/Война и мир_книга.txt";
         convertTextToSet(convertStringToArray(deletePuncMarks(fileName)));
    }


}
