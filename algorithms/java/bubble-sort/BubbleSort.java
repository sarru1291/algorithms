/**
 * BubbleSort
 */
public class BubbleSort {
 // swap adjacent elements
 public static void swap(int[] array, int i, int j) {
  if (i == j) {
   return;
  }

  int temp = array[i];
  array[i] = array[j];
  array[j] = temp;

 }
// bubble sort logic
 public static void bubbleSort(int[] a){
  for (int unsortedIndex = a.length-1; unsortedIndex >0; unsortedIndex--) {
   for (int i = 0; i < unsortedIndex; i++) {
    if (a[i]>a[i+1]) {
     swap(a,i,i+1);
    }
   }
  }
 }
 public static void main(String[] args) {
  int[] a={20,34,-15,7,55,1,-22};
  bubbleSort(a);
  printArray(a);
 }

}