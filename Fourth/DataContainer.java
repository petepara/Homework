package homeworkJava.Fourth;

import java.util.Arrays;
import java.util.Objects;

public class DataContainer <T> {

    public T [] data;
    public DataContainer(T[] items){
      data = items;
    }

    public int add(T item){

        if(item ==null){
          return  -1;
        }
        for (int i = 0; i < data.length; i++) {

             if (data[i] == null) {
                data[i] = item;
                return i;
             }
        }
        data = Arrays.copyOf(data, data.length + 1);
        data[data.length - 1] = item;
        return  data.length - 1;
    }

    public T get(int index){
        if(index>(data.length-1)||index<0){
            return null;
        }
        else {
            return data[index];
        }
    }

    public T [] getItems(){
        return data;
    }

    public boolean delete(int index){
        T temp;
        if(index>(data.length-1)||index<0){
            return false;
        }
        for (int i = index; i < data.length-1; i++) {
             data[i] = data[i+1];
        }
        data = Arrays.copyOf(data, data.length -1);
        return true;
    }

    public boolean delete(T item){

        boolean isMatch = false;

        for (int k = 0; k < data.length; k++) {
            if (Objects.equals(data[k],item)){
                isMatch = true;
                for (int j = k; j < data.length-1; j++) {
                    data[j] = data[j+1];
                }
            }
        }
        data = Arrays.copyOf(data, data.length -1);
        return isMatch;
    }
}
