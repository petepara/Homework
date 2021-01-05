package homeworkJava.Fourth;

import java.util.Arrays;

public class DataContainerMain {
    public static void main(String[] args) {
        String [] kakaha = new String[] {"ОГОНЬ", "ОГОНЬ", "ОГОНЬ", null, null, null};
        DataContainer<String> myContainer = new DataContainer<>(kakaha);
       // myContainer.add("ОГОНЬ");
        System.out.println(myContainer.add("Гвоздь"));
        System.out.println(myContainer.add("Гвоздь"));
        System.out.println(myContainer.add(null));
        System.out.println(myContainer.get(4));
        System.out.println(myContainer.get(8));
        System.out.println(Arrays.toString(myContainer.getItems()));
        System.out.println(myContainer.delete(0));
        System.out.println(Arrays.toString(myContainer.getItems()));
        System.out.println(myContainer.delete(null));
        System.out.println(Arrays.toString(myContainer.getItems()));

    }
}
