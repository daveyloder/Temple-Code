package Feb_23_2024;

import java.util.Stack;

public class SumStack {
   public static void main(String[] args) {
      Stack<Integer> stack = new Stack<>(); // Create a Queue here
      for (int i = 1; i <= 5; i++)
         stack.add(i);
      System.out.println(stack); // [1, 2, 3, 4, 5]
      System.out.println(sum(stack));
      System.out.println(stack);
   }

   /* returns the sum of the elements in Queue q */
   public static int sum(Stack<Integer> s) {
      int sum = 0;
      for (int i = 0; i < s.size(); i++) {
         int n = s.pop();
         sum = sum + n;
         s.push(n);
      }
      return sum;
   }
}
