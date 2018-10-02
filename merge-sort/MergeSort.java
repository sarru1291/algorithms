public class MergeSort {

    static void printArray(int array[]) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }

    static void merge(int arr[], int beg, int mid, int end) {

        int l = mid - beg + 1;
        int r = end - mid;

        int LeftArray[] = new int[l];
        int RightArray[] = new int[r];

        for (int i = 0; i < l; ++i)
            LeftArray[i] = arr[beg + i];

        for (int j = 0; j < r; ++j)
            RightArray[j] = arr[mid + 1 + j];

        int i = 0, j = 0;
        int k = beg;
        while (i < l && j < r) {
            if (LeftArray[i] <= RightArray[j]) {
                arr[k] = LeftArray[i];
                i++;
            } else {
                arr[k] = RightArray[j];
                j++;
            }
            k++;
        }
        while (i < l) {
            arr[k] = LeftArray[i];
            i++;
            k++;
        }

        while (j < r) {
            arr[k] = RightArray[j];
            j++;
            k++;
        }
    }

    static void mergeSort(int arr[], int beg, int end) {
        if (beg < end) {
            int mid = (beg + end) / 2;
            mergeSort(arr, beg, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, beg, mid, end);
        }
    }

    public static void main(String... input) {

        int size = Integer.parseInt(input[0]); // taking size of array from command line argument
        int array[] = new int[size];

        // System.err.println("Worst case:Array");
        // for (int s = 0; s < size; s++) {
        // array[s] = size - s - 1;
        // }
        // System.err.println("Best case:Array");
        // for(int s=0;s<size;s++){
        // array[s]=s;
        // }
        System.err.println("Average case:Array");
        for (int s = 0; s < size; s++) {
            array[s] = (int) (Math.random() * 10000 + 1);
        }
        printArray(array);
        mergeSort(array, 0, array.length - 1);

        System.out.println("Sorted Array: ");
        printArray(array);
    }
}