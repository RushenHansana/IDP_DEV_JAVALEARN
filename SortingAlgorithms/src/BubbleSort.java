public class BubbleSort{
    //print given array
    static void prnt(int a[]){
        int n = a.length;

        for (int i =0; i < n ; i++){
            System.out.print(a[i]+" ");
        }
    }
    //sorting logic
    static void bubblesort(int a[]){
        int n = a.length;
        int tmp = 0;

        for (int i =0;i <n ; i++){
            for (int j=1;j<n-i;j++){
                if (a[j] < a[j-1]){
                    tmp = a[j];
                    a[j] = a[j-1];
                    a[j-1]= tmp;
                }
            }

        }
    }

    public static void main(String[] args){
        int a[] = {35,10,31,11,26};//initialize array
        BubbleSort b = new BubbleSort();
        System.out.println("Before sorting array elements are ==> ");
        b.prnt(a);
        b.bubblesort(a);
        System.out.println();
        System.out.println("After sorting array elements are ==> ");
        b.prnt(a);
    }

}