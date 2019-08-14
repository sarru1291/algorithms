import java.util.Stack;

/**
 * Imagine you are building a compiler. Before running any code, the compiler
 * must check that the parentheses in the program are balanced. Every opening
 * bracket must have a corresponding closing bracket. We can approximate this
 * using strings.
 * 
 * Given a string containing just the characters '(', ')', '{', '}', '[' and
 * ']', determine if the input string is valid. An input string is valid if: -
 * Open brackets are closed by the same type of brackets. - Open brackets are
 * closed in the correct order. - Note that an empty string is also considered
 * valid.
 * 
 */
public class BalancedParentheses {

 static boolean isMatchingClosing(char cp, char op) {
  char[] carr = { '}', ')', ']' };
  char[] orr = { '{', '(', '[' };
  for (int k = 0; k < carr.length; k++) {
   if (carr[k] == cp && orr[k] == op) {
    return true;
   }
  }
  return false;
 }

 static boolean isOpeningParen(char c) {
  char[] op = { '{', '(', '[' };
  for (int j = 0; j < op.length; j++) {
   if (op[j] == c) {
    return true;
   } else
    continue;
  }
  return false;
 }

 static boolean isBalanced(String paren) {
  Stack<Character> stack = new Stack<>();
  for (int i = 0; i < paren.length(); i++) {
   if (isOpeningParen(paren.charAt(i))) {
    stack.push(paren.charAt(i));
   } else {
    if (!stack.isEmpty() && isMatchingClosing(paren.charAt(i), stack.peek())) {
     stack.pop();
    } else {
     return false;
    }
   }
  }
  if (!stack.isEmpty()) {
   return false;
  }
  return true;
 }

 public static void main(String[] args) {
  String s1 = "[()]{}";
  String s2 = "({[)]";
  System.out.println(isBalanced(s1));
 }
}