import java.util.ArrayList;
import java.util.Random;

class Bucket {
    ArrayList<Integer> bucket = new ArrayList<Integer>();
}

public class BucketSort {
    static void printArray(int array[]) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }

    static void bucketSort(int[] array) {
        Bucket[] buckets = new Bucket[10];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new Bucket();
        }

        for (int n : array) {
            int bucketIndex = n * 10 / 10000;
            buckets[bucketIndex].bucket.add(n);
        }

        // for (Bucket n : buckets) {
        // System.out.print("Bucket ");
        // for (int num : n.bucket) {

        // System.out.print(num + " ");
        // }
        // System.out.println();
        // }

        int index = 0;
        for (Bucket n : buckets) {
            insertionSort(n.bucket);
            for (int num : n.bucket) {
                array[index] = num;
                index++;
            }

        }

        // for (Bucket n : buckets) {
        // System.out.print("Bucket ");
        // for (int num : n.bucket) {

        // System.out.print(num + " ");
        // }
        // System.out.println();
        // }

    }

    public static void main(String[] input) {

        int size = Integer.parseInt(input[0]);
        int[] array = new int[size];

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
        bucketSort(array);
        System.out.println("Sorted Array: ");
        printArray(array);
    }

    static void insertionSort(ArrayList<Integer> array) {
        for (int i = 0; i < array.size() - 1; i++) {
            int temp = array.get(i);
            for (int j = i - 1; j >= 0 && temp < array.get(j); j--) {
                array.set(j + 1, array.get(j));
                array.set(j, temp);

            }
        }
    }

}
