
public class SelectionSort {

    //Sorting logic
    static void selctionsort(int[] arr){
        int l = arr.length;
        int minidx,temp;
        for(int i =0;i <l-1;i++){
            minidx = i;
            for (int j= i+1; j< l; j++){
                if (arr[j] < arr[minidx]){
                    minidx = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[minidx];
            arr[minidx] = temp;
        }

    }
    //Printing a given array
    static void printarray(int[] arr){
        for(int i = 0;i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void  main(String[] args){
        int arr[] = {64,25,12,22,11};
        selctionsort(arr);
        System.out.print("Sorted array : ");
        printarray(arr);

    }
}
