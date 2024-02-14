package Feb_9_2024;

public class NodeTest {
   public static void main(String[] args) {
      // TODO: 1) create and initialize nodes with values 5, 1, and 2.
      Node one = new Node();
      one.data = 5;
      Node two = new Node();
      two.data = 1;
      Node three = new Node();
      three.data = 2;

      // TODO: 2) link the nodes to create the list [2, 1, 5]
      three.next = two;
      two.next = one;
      // TODO: 3) Iterate through the list and print 2 -> 1 -> 5 -> null
      for (Node x = three; x != null; x = x.next) {
         System.out.print(x.data + " -> ");
      }
   }
}
