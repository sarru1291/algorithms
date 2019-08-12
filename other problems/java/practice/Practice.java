/**
 * Practice
 */
enum Fruits {
 APPLE("RED"), BANANA("YELLOW"), ORANGE("ORANGE");
 String value;

 private Fruits(String color) {
  this.value = color;
 }

 public String getColor() {
  return this.value;
 }
}
public class Practice {

 public static void main(String[] args) {
  char ccc = '9';
  System.out.println( Integer.parseInt(Character.toString(ccc) instanceof ));
  
 }
}