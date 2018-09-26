import java.util.ArrayList;

public class BucketSort {

    static void printSingleArray(int array[]) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }

    static void printDoubleArray(int array[][]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; array[i][j] != 0; j++) {
                System.err.print(array[i][j] + " ");
            }
        }
        System.err.println("\n");
    }

    static int[][] bucketSort(int[] array) {
        int[][] bucketList = new int[array.length][array.length];

        for (int k = 0; k < array.length; k++) {
            int bucket = (array[k] * array.length) / (10000 + 1);
            int j = 0;
            bucketList[bucket][j] = array[k];
            j++;

            for (int i = bucket; i < array.length; i++) {
                System.err.print(i);
                for (int a = 0; bucketList[i][a] != 0; a++) {
                    System.err.print(" " + bucketList[i][a] + " \n");
                }
            }

        }
        return bucketList;
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
        printSingleArray(array);
        int[][] sortedArray = bucketSort(array);
        System.out.println("Sorted Array: ");
        // printDoubleArray(sortedArray);
    }
}
