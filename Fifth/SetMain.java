package homeworkJava.Fifth;


import java.io.IOException;


import static homeworkJava.Fifth.SetHM21.*;

public class SetMain {
    public static void main(String[] args) throws IOException {

        String fileName = "C:\\Курсы\\Война и мир_книга.txt";

        convertTextToSet(convertStringToArray(deletePuncMarks(fileName)));
    }


}
