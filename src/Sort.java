import java.util.ArrayList;
import java.util.Arrays;

public class Sort {

    public static int[] bubbleSort(int[] array) {
        for(int i = 0; i < array.length; i++){
            boolean swap = false;
            for(int j = i + 1; j < array.length; j++){
                if(array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    swap = true;
                }
            }
            if (!swap)
                break;
        }
        return array;
    }

    public static String[] bubbleSort(String[] array) {
        for(int i = 0; i < array.length; i++){
            boolean swap = false;
            for(int j = i + 1; j < array.length; j++){
                if(array[j].toLowerCase().compareTo(array[i].toLowerCase()) < 0) {
                    String temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    swap = true;
                }
            }
            if (!swap)
                break;
        }
        return array;
    }

    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> list) {
        for(int i = 0; i < list.size(); i++){
            boolean swap = false;
            for(int j = i + 1; j < list.size(); j++){
                if(list.get(i) > list.get(j)) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                    swap = true;
                }
            }
            if (!swap)
                break;
        }
        return list;
    }

    public static int[] selectionSort(int[] array) {
        for(int i = 0; i < array.length - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < array.length; j++){
                if(array[j] < array[minIndex]){
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }

    public static String[] selectionSort(String[] array) {
        for(int i = 0; i < array.length - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < array.length; j++){
                if(array[j].toLowerCase().compareTo(array[minIndex].toLowerCase()) < 0){
                    minIndex = j;
                }
            }
            String temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }

    public static ArrayList<String> selectionSort(ArrayList<String> list) {
        for(int i = 0; i < list.size() - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < list.size(); j++){
                if(list.get(j).toLowerCase().compareTo(list.get(minIndex).toLowerCase()) < 0){
                    minIndex = j;
                }
            }
            String temp = list.get(minIndex);
            list.set(minIndex,list.get(i));
            list.set(i, temp);
        }
        return list;
    }

}
