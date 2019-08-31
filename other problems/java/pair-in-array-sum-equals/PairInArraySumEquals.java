import java.util.*;

/**
 * Pair In Array whose Sum Equals a given number
 */
public class PairInArraySumEquals {

    // Using Naive method
    // static void findPair(int[] a,int givenNumber){
    // for (int i = 0; i < a.length; i++) {
    // for (int j = i+1; j <a.length ; j++) {
    // if(a[i]+a[j]==givenNumber){
    // System.out.println("6: "+a[i]+" "+a[j]);
    // }
    // }
    // }
    // }

    // Using Hash method
    // static void findPair(int[] a, int givenNumber) {
    // HashSet<Integer> hashset = new HashSet<>();
    // for (int i = 0; i < a.length; i++) {
    // int b=givenNumber-a[i];
    // if(hashset.contains(b)){
    // System.out.println("6: "+a[i]+" "+b);
    // }
    // hashset.add(a[i]);
    // }
    // }

    // Using two pointer
    static void findPair(int[] a, int givenNumber) {
        Arrays.sort(a);
        int i = 0;
        int j = a.length - 1;
        while (j > i) {
            int curr_sum = a[i] + a[j];
            if (curr_sum == givenNumber) {
                System.out.println(givenNumber + ": " + a[i] + " " + a[j]);
                i++;
                j--;
            } else if (curr_sum > givenNumber) {
                j--;
            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = { 2, 4, 6, 7, 9, 3, 3, 1, 5 };
        int givenNumber = 6;

        findPair(a, givenNumber);
    }
}