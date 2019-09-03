import java.util.*;

/**
 * ReverseAnArray
 */
public class ReverseAnArray {

    public static void main(String[] args) {
        int[] a={1,2,3,4,5};

        // Method 1
        // for (int i = 0; i < a.length/2;i++) {
        //     int temp=a[i];
        //     a[i]=a[a.length-i-1];
        //     a[a.length-i-1]=temp;
        // }
        // Arrays.stream(a).forEach(y->System.out.print(y+" "));

        // Method 2
        int[] b=new int[a.length];
        int j=0;
        for (int i = a.length-1; i >=0; i--) {
            b[j]=a[i];
            j++;
        }
        Arrays.stream(b).forEach(y->System.out.print(y+" "));

    }
}