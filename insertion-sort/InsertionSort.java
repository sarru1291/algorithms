public class InsertionSort {

    static void printArray(int array[]) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }

    static int[] insertionSort(int array[]) {
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            for (int j = i - 1; j >= 0 && temp < array[j]; j--) {
                array[j + 1] = array[j];
                array[j] = temp;
            }
        }
        return array;
    }

    public static void main(String... input) {
        int size = Integer.parseInt(input[0]);
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
            array[s] = (int) (Math.random() * 1000 + 1);
        }
        printArray(array);

        int[] sortedArray = insertionSort(array);
        System.err.println("Sorted Array: ");
        printArray(sortedArray);
    }
}