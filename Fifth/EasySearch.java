package homeworkJava.Fifth;

public class EasySearch implements ISearchEngine {

   //Доработать код
    @Override
    public long search(String text, String word) {

        int index = 0;
        int count = 0;
        String text2 = text.replace("."," ")
                           .replace(",", " ")
                           .replace("!"," ")
                           .replace("?", " ")
                           .replace(":", " ")
                           .replace(";"," ")
                           .replace(")"," ")
                           .replace("("," ")
                           .replace("\""," ");
        while (index != -1) {
            count++;
            text2 = text2.substring(index + 1);
            index = text2.indexOf(" " + word + " ");

        }


        return count;
    }
}
