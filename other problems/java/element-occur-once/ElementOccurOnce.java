import java.util.*;

/**
 * A number occur once in an array where every other element occur twice
 */
public class ElementOccurOnce {
public static void main(String[] args) {
  int a[] = { 3, 4, 5, 5, 6, 6, 4, 7, 8, 7, 8 };

  // Method 1
  int res = a[0];
  for (int i = 1; i < a.length; i++) {
   res = res ^ a[i];
  }
  System.out.println(res);

  // Method 2
  HashMap<Integer, Integer> map = new HashMap<>();
  for (int i = 0; i < a.length; i++) {
   if (map.containsKey(a[i])) {
    map.replace(a[i], map.get(a[i]), map.get(a[i]) + 1);
   } else {
    map.put(a[i], 1);
   }
  }
  for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
   if (entry.getValue() == 1) {
    System.out.println(entry.getKey());
   }
  }
}
 
}