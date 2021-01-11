package homeworkJava.Fourth;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class DataContainer <T> {

    private T [] data;
    public DataContainer(T[] items){
      this.data = items;
    }

    public void print(){
        System.out.println(Arrays.toString(this.data));
    }

    public void sort(Comparator<T> comparator){
        boolean swap;
        do {
            swap = false;
            for (int i = 0; i < this.data.length-1; i++) {
                if (comparator.compare(this.data[0], this.data[1]) > 0){
                    swap(this.data, i, i + 1);
                    swap = true;
                }
            }
        } while (swap);
    }

    public static void sort(DataContainer<? extends Comparable> container){
        boolean swap;
        do{
            swap = false;
            for (int i = 0; i < container.data.length-1; i++) {
                if(container.data[i].compareTo(container.data[i+1])>0){
                    swap(container.data,i,i+1);
                    swap = true;
                }
                
            }
        }while (swap);
    }

    public static <Z> void sort(DataContainer<Z> container, Comparator<Z> comparator){
        boolean swap;
        do {
            swap = false;
            for (int i = 0; i < container.data.length-1; i++) {
                if (comparator.compare(container.data[0], container.data[1]) > 0){
                    swap(container.data, i, i + 1);
                    swap = true;
                }
            }
        } while (swap);
    }
//    public static void sort(int[] arr){
//        boolean swap;
//        do {
//            swap = false;
//            for (int i = 0; i < arr.length-1; i++) {
//                if (arr[i] > arr[i + 1]){
//                    //
//                    swap = true;
//                }
//            }
//        } while (swap);
//    }

    private static <T> void swap(T[] arr, int from, int to){
        T temp = arr[from];
        arr[from] = arr[to];
        arr[to] = temp;
    }
    public int add(T item){
        if(this.data.length == 0){
            this.data = Arrays.copyOf(this.data, this.data.length + 1);
        }
        if(item ==null){
          return  -1;
        }
        for (int i = 0; i < this.data.length; i++) {
             if (this.data[i] == null) {
                 this.data[i] = item;
                return i;
             }
        }
        this.data = Arrays.copyOf(data,   this.data.length + 1);
        this.data[this.data.length - 1] = item;
        return  this.data.length - 1;
    }



    public T get(int index){
        if(index>(  this.data.length-1)||index<0){
            return null;
        }
        else {
            return   this.data[index];
        }
    }

    public T [] getItems(){
        return   this.data;
    }

    public boolean delete(int index){
        T temp;
        if(index>(  this.data.length-1)||index<0){
            return false;
        }
        for (int i = index; i <   this.data.length-1; i++) {
            this.data[i] =   this.data[i+1];
        }
        this.data = Arrays.copyOf(data,   this.data.length -1);
        return true;
    }

    public boolean delete(T item){

        boolean isMatch = false;

        for (int k = 0; k <   this.data.length; k++) {
            if (Objects.equals(  this.data[k],item)){
                isMatch = true;
                for (int j = k; j <   this.data.length-1; j++) {
                    this.data[j] =   this.data[j+1];
                }
            }
        }
        this.data = Arrays.copyOf(data,   this.data.length -1);
        return isMatch;
    }

     public String toString(){
         StringBuilder builder = new StringBuilder();
         builder.append("[");
        for (T item : this.data){
            if(item!=null){
                builder.append(item).append(",");
            }
        }
         builder.deleteCharAt(builder.length()-1);
         builder.append("]");
         return  builder.toString();
     }

}
