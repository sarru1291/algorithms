
/*
 finding the unit digit of a product e.g. (34663)^345
 Step 1. If base unit digit is 0 or 1 or 5 or 6 then required unit digit will be 0 or 1 or 5 or 6.
 Step 2. If not then Follow below step:
       -> reduce unit digit of power by 1 (345-1)
       -> divide this by 4 (345/4)
       -> increase the remainder obtained by 1 (345%4+1)
       -> make power of unit digit of base to number obtained in last step(3^(345%4+1))
       -> unit digit will be required unit digit
*/
import java.util.*;

public class UnitDigit {
 public static void main(String[] args) {
  int x = 45, y = 37; // (45)^37
  if (x % 10 == 0 || x % 10 == 1 || x % 10 == 5 || x % 10 == 6) {
   System.out.println("Unit digit is " + x % 10);
  } else {
   y = y - 1;
   int z = y % 4;
   z = z + 1;
   System.out.println("Unit digit is " + Math.pow((double) x % 10, (double) z));
  }
 }
}