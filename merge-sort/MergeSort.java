public class MergeSort {
    static void printArray(int array[]) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }

    static void conquer(int[] array, int low, int mid, int high) {
        int i, j, k;
        int[] temp = new int[50];
        i = low;
        k = low;
        j = mid + 1;
        while (i <= mid && j <= high) {
            if (array[i] < array[j]) {
                temp[k] = array[i];
                k++;
                i++;
            } else {
                temp[k] = array[j];
                k++;
                j++;
            }
        }
        while (i <= mid) {
            temp[k] = array[i];
            k++;
            i++;
        }
        while (j <= high) {
            temp[k] = array[j];
            k++;
            j++;
        }
        for (i = low; i < k; i++) {
            array[i] = temp[i];
        }
    }

    static void divide(int array[], int low, int high) {

        if (low < high) {
            int mid = (low + high) / 2;
            divide(array, low, mid);
            divide(array, mid + 1, high);

            conquer(array, low, mid, high);
        }

    }

    public static void main(String... input) {
        int size = Integer.parseInt(input[0]); // taking size of array from command line argument
        int array[] = new int[size];

        // System.err.println("Worst case:Array");
        // for(int s=0;s<size;s++){
        // array[s]=array[size-i-1];
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
        int low = 0, high = size - 1;
        divide(array, low, high);
        System.out.println("Sorted Array: ");
        printArray(array);
    }
}