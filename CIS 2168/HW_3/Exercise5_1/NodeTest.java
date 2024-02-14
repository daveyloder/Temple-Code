package HW_3.Exercise5_1;

import java.util.*;

public class NodeTest {

   public static void main(String[] args) {

      // TODO: a) create and initialize nodes with values 5, 1, and 2.
      // TODO: 2) link the nodes to create the list [2, 1, 5]

      Node five = new Node(5);
      Node one = new Node(1, five);
      Node two = new Node(2, one);

      // TODO: 3) Iterate through the list and print 2 -> 1 -> 5 -> null
      // for loop
      System.out.println("--- For loop ---");
      for (Node x = two; x != null; x = x.next) {
         System.out.print(x.data + " -> ");
      }
      System.out.print(five.next);
      System.out.println();
      // while loop
      System.out.println("--- While loop ---");
      Node x = two;
      while (x != null) {
         System.out.print(x.data + " -> ");
         x = x.next;
      }
      System.out.print(five.next);
   }
}
