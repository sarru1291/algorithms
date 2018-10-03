class HeapSort {

    static void printArray(int array[]) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }

    static void buildHeap(int arr[], int size, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < size && arr[left] > arr[largest])
            largest = left;

        if (right < size && arr[right] > arr[largest])
            largest = right;

        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            buildHeap(arr, size, largest);
        }
    }

    static void heapSort(int arr[], int size) {
        int i;
        for (i = size / 2 - 1; i >= 0; i--)
            buildHeap(arr, size, i);
        for (i = size - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            buildHeap(arr, i, 0);
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
        // for (int s = 0; s < size; s++) {
        // array[s] = s;
        // }
        System.err.println("Average case:Array");
        for (int s = 0; s < size; s++) {
            array[s] = (int) (Math.random() * 10000 + 1);
        }
        printArray(array);
        heapSort(array, array.length);

        System.out.println("Sorted Array: ");
        printArray(array);

    }
}