import java.util.Arrays;

public class InsertionSort {
    //sorting logic
    static void insertionsort(int[] arr){
        int size = arr.length;
        int key; //selected poin in array
        for (int step =1;step < size;step++){
            key = arr[step];
            int j = step -1;
            //insertion
            while (j>=0 && key < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    public static void main(String[] args){
        int[] data = { 9, 5, 1, 4, 3 };
        insertionsort(data);
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(data));
    }
}
